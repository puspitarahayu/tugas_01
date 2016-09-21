package id.sch.smktelkom_mlg.tugas01.xirpl2022.tugas01;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    EditText etN;
    EditText etTelp;
    RadioButton rbJNE;
    RadioButton rbTIKI;
    CheckBox cb1, cb2, cb3, cb4;
    RadioGroup rgJS;
    Button bOrder;
    Spinner spDomisili;
    TextView tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etN = (EditText)
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
        tvHasil = (TextView)
                findViewById(R.id.textViewHasil);

        bOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProcess();
            }
        });
    }

    private void doProcess() {
        String Nama = etN.getText().toString();
        String Telepon = etTelp.getText().toString();
        tvHasil.setText(Nama + "Pesanan anda segera kami proses, trimakasih sudah membeli produk kami, kami tunggu pemesanan selanjutnya oleh " + Telepon);
    }

    private boolean isValid() {
        boolean valid = true;

        String Nama = etN.getText().toString();
        String Telepon = etTelp.getText().toString();

        if (Nama.isEmpty()) {
            etN.setError("Nama Belum Diisi");
            valid = false;
        } else if (etN.length() < 3) {
            etN.setError("Nama minimal 3 karakter");
            valid = false;
        } else {
            etN.setError(null);
        }
        if (Telepon.isEmpty()) {
            etTelp.setError("Telepon Belum Diisi");
            valid = false;
        } else {
            etTelp.setError(null);
        }
        return valid;
    }
}

