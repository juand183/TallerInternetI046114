package com.example.alexander.tallerinterneti046114.Parser;


import com.example.alexander.tallerinterneti046114.Model.User;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonU {

            public static List<User> getData(String content) throws JSONException {

            JSONArray jsonArray = new JSONArray(content);

            List<User> uList = new ArrayList<>();

            for (int i = 0; i < jsonArray.length(); i++){

                JSONObject item = jsonArray.getJSONObject(i);

                User user = new User();
                user.setCodigo(item.getString("codigo"));
                user.setNombre(item.getString("nombre"));
                user.setEdad(item.getString("edad"));
                user.setCorreo(item.getString("correo"));
                user.setPass(item.getString("pass"));

                uList.add(user);

            }

            return uList;
        }

    }

