package demo.simplegroovyapp.domain

import javax.inject.Inject

class Vehicle {

    private Motor motor

    @Inject
    Vehicle(Motor motor) {
        this.motor = motor
    }

    void setSpeed(int rpm) {
        motor.rpm = rpm
    }

    int getSpeed() {
        return motor.rpm
    }
}