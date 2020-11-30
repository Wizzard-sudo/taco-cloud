package tacos.service;

import tacos.dto.Ingredient;
import tacos.enumeration.Type;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();
    Ingredient findOne(String id);
    Ingredient save (Ingredient ingredient);

}
