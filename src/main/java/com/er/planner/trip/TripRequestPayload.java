package com.er.planner.trip;

import java.util.List;

//Records são classes que já geram os getters e setters e é um tipo de classe que não poderá ter suas informações manipuladas
public record TripRequestPayload(String destination, String starts_at, String ends_at, List<String> emails_to_invite, String owner_email, String owner_name) {

}
