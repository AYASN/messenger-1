package com.assir.yassine.messenger.database;

import com.assir.yassine.messenger.model.Message;
import com.assir.yassine.messenger.model.Profile;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {

    private static Map<Long, Message> messages = new HashMap<>();

    private static Map<Long, Profile> profiles = new HashMap<>();



    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<Long, Profile> getProfiles() {
        return profiles;
    }
}
