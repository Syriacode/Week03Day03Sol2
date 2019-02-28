package example.org.test.week03day03sol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyRecyclerViewAdapter myRecyclerViewAdapter;

    EditText etType;
    EditText etName;
    EditText etSound;
    ImageView etImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etType = findViewById(R.id.etAnimalType);
        etName = findViewById(R.id.etAnimalName);
        etSound = findViewById(R.id.etAnimalSound);
        etImage = findViewById(R.id.etAnimalImage);

        recyclerView = findViewById(R.id.rvRecyclerView);

    }


    public void onClick(View view) {
    }
}
