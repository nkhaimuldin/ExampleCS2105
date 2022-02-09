package com.company;

import com.company.inrefaces.IJumpingAthlete;

public class JumpingSwimmer extends Swimmer implements IJumpingAthlete {

    public JumpingSwimmer(String name) {
        super(name);
    }

    @Override
    public void compete() {
        System.out.println(getName() + " started competing");
        jump();
        swim();
    }
    public void example(){
        System.out.println("Example");
    }
    @Override
    public void jump() {
        System.out.println("Started jumping");
    }
}
