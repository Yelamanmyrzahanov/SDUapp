package kz.djunglestones.sduapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class SignUpActivity extends AppCompatActivity {
    private EditText full_name_edittext,email_edittext;
    private int ids[] = {R.id.full_name_edittext,R.id.email_edittext};
    private List<String> faculties;
    private Spinner faculty_spinner,admission_year_spinner,graduation_year_spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initUI();


        final ArrayAdapter<CharSequence> facultyAdapter = ArrayAdapter.createFromResource(this,R.array.faculties,R.layout.spinner_item_sign_up);
        facultyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        faculty_spinner.setAdapter(facultyAdapter);
        faculty_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                String text = adapterView.getItemAtPosition(pos).toString();
                Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        final ArrayAdapter<CharSequence> admissionYearAdapter = ArrayAdapter.createFromResource(this,R.array.admission_years,R.layout.spinner_item_sign_up);
        admissionYearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        admission_year_spinner.setAdapter(admissionYearAdapter);
        admission_year_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                String text = adapterView.getItemAtPosition(pos).toString();
                Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        final ArrayAdapter<CharSequence> graduationYearAdapter = ArrayAdapter.createFromResource(this,R.array.graduation_years,R.layout.spinner_item_sign_up);
        graduationYearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        graduation_year_spinner.setAdapter(graduationYearAdapter);
        graduation_year_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                String text = adapterView.getItemAtPosition(pos).toString();
                Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });












//        editTextChangeBackground();

    }

    private void initUI() {
        full_name_edittext = findViewById(R.id.full_name_edittext);
        email_edittext = findViewById(R.id.email_edittext);
        graduation_year_spinner = findViewById(R.id.graduation_year_spinner);
        faculty_spinner = findViewById(R.id.faculty_spinner);
        admission_year_spinner = findViewById(R.id.admission_year_spinner);
    }

    private void editTextChangeBackground() {
        for (int id:ids){
            final EditText editText = findViewById(id);
            editText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if (charSequence.toString().trim().isEmpty()){
                        editText.setBackgroundResource(R.drawable.sign_up_edittext_inactive);
                    }else{
                        editText.setBackgroundResource(R.drawable.login_custom_edittext);
                    }
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
        }
    }


}
