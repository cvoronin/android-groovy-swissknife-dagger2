package demo.simplegroovyapp.component;

import javax.inject.Singleton;

import dagger.Component;
import demo.simplegroovyapp.domain.Vehicle;
import demo.simplegroovyapp.module.VehicleModule;

@Singleton
@Component(modules = [VehicleModule])
interface VehicleComponent {

    Vehicle provideVehicle();
}