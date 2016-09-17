package id.sch.smktelkom_mlg.tugas01.xirpl2022.tugas01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText etNama;
    EditText etTelp;
    RadioButton rbJNE;
    RadioButton rbTIKI;
    CheckBox cb1, cb2, cb3, cb4;
    RadioGroup rgJS;
    Button bOrder;
    Spinner spDomisili;
    TextView tvHasil

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        etNama = (EditText)
                findViewById(R.id.editTextNama);
        etTelp = (EditText)
                findViewById(R.id.editTextTelp);
        rgJS = (RadioGroup)
                findViewById(R.id.radioGroupJS);
        rbJNE = (RadioButton)
                findViewById(R.id.radioButtonJNE);
        rbTIKI = (RadioButton)
                findViewById(R.id.radioButtonTIKI);
        cb1 = (CheckBox)
                findViewById(R.id.checkBox1);
        cb2 = (CheckBox)
                findViewById(R.id.checkBox2);
        cb3 = (CheckBox)
                findViewById(R.id.checkBox3);
        cb4 = (CheckBox)
                findViewById(R.id.checkBox4);
        bOrder = (Button)
                findViewById(R.id.buttonOrder);
        spDomisili = (Spinner)
                findViewById(R.id.spinnerDomisili);
        tvHasil2 = (TextView)
                findViewById(R.id.textViewHasil2);
        tvHasil3= (TextView)
                findViewById(R.id.textViewHasil3);

        bOrder.setOnClickListener(new view.OnClickListener()
        @Override
        public void OnClick(View view)
        {
            doProcess();
            doClick();
        });


    }
}
