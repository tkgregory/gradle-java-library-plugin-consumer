package com.tomgregory;

import java.io.IOException;

public class DoStuff {
    public static void main(String[] args) throws IOException {
        AwesomeService awesomeService = new AwesomeService();

        System.out.println(awesomeService.getWebPage().get("status"));
    }
}
