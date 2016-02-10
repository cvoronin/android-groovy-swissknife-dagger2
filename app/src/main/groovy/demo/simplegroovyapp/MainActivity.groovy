package demo.simplegroovyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.arasthel.swissknife.SwissKnife
import com.arasthel.swissknife.annotations.InjectView
import com.arasthel.swissknife.annotations.OnClick
import groovy.transform.CompileStatic;

@CompileStatic
public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.message)
    TextView message

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwissKnife.inject(this);
    }

    @OnClick(R.id.btnShowDate)
    void doShowDate() {
        message.text = new Date().toString()
    }


}
