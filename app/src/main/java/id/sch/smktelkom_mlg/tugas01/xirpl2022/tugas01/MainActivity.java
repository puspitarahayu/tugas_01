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

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

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
    String Nama = etNama.getText().toString();
    int Telepon = Integer.parseInt(etTelp.getText().toString());
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

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
        tvHasil3 = (TextView)
                findViewById(R.id.textViewHasil3);

        bOrder.setOnClickListener(new view.OnClickListener()
        @Override
        public void OnClick (View view)
        {
            doProcess();
            doClick();
        })
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://id.sch.smktelkom_mlg.tugas01.xirpl2022.tugas01/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://id.sch.smktelkom_mlg.tugas01.xirpl2022.tugas01/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    tvHasil.setText(Nama+" Pesanan Anda segera kami proses, trimakasih sudah membeli produk kami, kami tunggu pemesanan selanjutnya oleh  "+Telepon)

}
}

private boolean isValid()
        {
        boolean valid=true;

        String Nama=etNama.getText().toString();
        String Telepon=etTelp.getText().toString();

        if(Nama.isEmpty())
        {
        etNama.setError("Nama Belum Diisi");
        valid=false;
        }
        else if(etNama/length()<3)
        }
        etNama.setError("Nama minimal 3 karakter");
        valid=false;
        }

        else
        {
        etNama.setError(null);
        }
        if(Telepon.isEmpty())
        {
        etTelp.setError("Telepon Belum Diisi");
        valid=false;
        }

        else
        {
        etTelp.setError(null);
        }
        return valid;
        }
        }

