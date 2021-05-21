package sg.edu.rp.c346.id20043679.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDetails;
    Button bkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDetails = findViewById(R.id.textView);
        bkButton = findViewById(R.id.button);

        Intent intentReceived = getIntent();

        String selectedCode = intentReceived.getStringExtra("code");
        String selectedName = intentReceived.getStringExtra("name");
        String selectedYear = intentReceived.getStringExtra("year");
        String selectedSem = intentReceived.getStringExtra("semester");
        String selectedCredit = intentReceived.getStringExtra("credit");
        String selectedVenue = intentReceived.getStringExtra("venue");

        String println = String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %s" +
                "\nSemester: %s\nModule Credit: %s\nVenue: %s", selectedCode, selectedName, selectedYear
        , selectedSem, selectedCredit, selectedVenue);

        tvDetails.setText(println);

        bkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(back);

            }
        });




    }
}