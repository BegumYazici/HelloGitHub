package uygulama1.begi.com.adapter_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    private Spinner spnCountries;

    public void init()
    {

        spnCountries =(Spinner) findViewById(R.id.spnCountries);

    }

    private void spnCountries_Selection()
    {
        spnCountries.setOnItemSelectedListener(

                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                        String selection = spnCountries.getItemAtPosition(i).toString();
                        MainActivity.this.setTitle(selection);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {

                    }
                }
        );
    }


    public void register_Handlers()
    {
        spnCountries_Selection();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        register_Handlers();
    }
}









