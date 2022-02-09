package com.company;

import com.company.inrefaces.IAthlete;

public class Main {
    public static void main(String[] args) {
        IAthlete athlete = new JumpingSwimmer("Askhat");

        athlete.compete();
        athlete.sayHooray();
    }
}
