package demo.simplegroovyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle
import android.widget.EditText;
import android.widget.TextView;

import com.arasthel.swissknife.SwissKnife
import com.arasthel.swissknife.annotations.InjectView
import com.arasthel.swissknife.annotations.OnClick
import demo.simplegroovyapp.component.DaggerVehicleComponent
import demo.simplegroovyapp.component.VehicleComponent
import demo.simplegroovyapp.domain.Vehicle
import groovy.transform.CompileStatic;

@CompileStatic
public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.txtRpm)
    TextView txtRpm

    @InjectView(R.id.edtRpm)
    EditText edtRpm

    Vehicle vehicle

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SwissKnife.inject(this)

        VehicleComponent vehicleComponent = DaggerVehicleComponent.builder().build()
        vehicle = vehicleComponent.provideVehicle()
    }

    @OnClick(R.id.btnSetRpm)
    void setRpm() {
        try {
            vehicle.speed = edtRpm.text.toString().toInteger()
            txtRpm.text = "Current RPM is $vehicle.speed"
        } catch (NumberFormatException e) {

        }
    }

}
