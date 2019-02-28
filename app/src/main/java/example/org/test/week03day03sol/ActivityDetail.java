package example.org.test.week03day03sol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Random;

public class ActivityDetail extends AppCompatActivity {

    Random random = new Random();
    int randomPopulation = (random.nextInt(100) + 1);
    Animal animal;
    ListView lstPassedAnimalName;
    Intent passedIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        lstPassedAnimalName = findViewById(R.id.lstSimpleListView);
        if(getIntent() != null) {
            passedIntent = getIntent();
            Bundle bundle = passedIntent.getExtras();
            animal = bundle.getParcelable("animal");
            Toast.makeText(this, animal.getAnimalType() + " was passed" , Toast.LENGTH_LONG).show();
        }


    }
}
