package demo.simplegroovyapp.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import demo.simplegroovyapp.domain.Motor;
import demo.simplegroovyapp.domain.Vehicle;

@Module
class VehicleModule {

    @Singleton
    @Provides
    Motor provideMotor() {
        new Motor()
    }

    @Singleton
    @Provides
    Vehicle providesVehicle() {
        new Vehicle(new Motor())
    }

}