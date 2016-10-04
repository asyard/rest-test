package com.asy.test.rest;

import com.asy.test.rest.model.Color;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Created by Asy
 */
public class JerseyClient {

    public static void main(String[] args) {
        try {
            Client client = Client.create();
            WebResource webResource = client.resource("http://localhost:2500/rest/colors");

            ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
            }

            Color[] output = response.getEntity(Color[].class);

            System.out.println("Output from Server .... \n");
            for (Color c : output) {
                System.out.println(c);
                if (c.getColorDetail() != null) {
                    System.out.println("detail : " + c.getColorDetail());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
