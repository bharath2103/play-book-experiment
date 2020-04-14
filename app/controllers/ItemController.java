package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Item;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.ItemService;

import javax.inject.Inject;
import java.util.List;

public class ItemController extends Controller {

    @Inject
    public ItemService itemService;

    public Result getItem(Long id){
        Item item = itemService.getItem(id);
        JsonNode jsonNode = Json.toJson(item);
        return ok(jsonNode);
    }
}
