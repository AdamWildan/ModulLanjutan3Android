package id.sch.smktelkommlg.www.operatormatematika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView txtAwal, txtOperator, txtHasil;
    EditText editAwal, editKedua, editHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTambah = (Button)findViewById(R.id.btnTambah);
        btnKurang = (Button)findViewById(R.id.btnKurang);
        btnBagi = (Button)findViewById(R.id.btnBagi);
        btnKali = (Button)findViewById(R.id.btnKali);
        txtOperator = (TextView) findViewById(R.id.txtOperator);
        txtAwal = (TextView) findViewById(R.id.txtAwal);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        editAwal = (EditText) findViewById(R.id.editAwal);
        editKedua = (EditText) findViewById(R.id.editKedua);
        editHasil = (EditText) findViewById(R.id.editHasil);
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpenjumlahan();
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpengurangan();
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorperkalian();
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operatorpembagian();
            }
        });
    }
    private void operatorpenjumlahan() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int penjumlahan = angkaawal + angkakedua;
        editHasil.setText(penjumlahan+"");
    }
    private void operatorpengurangan() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int pengurangan = angkaawal - angkakedua;
        editHasil.setText(pengurangan+"");
    }
    private void operatorperkalian() {
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int perkalian = angkaawal * angkakedua;
        editHasil.setText(perkalian + "");
    }
    private void operatorpembagian() {
        double angkaawal = Double.parseDouble(editAwal.getText().toString());
        double angkakedua = Double.parseDouble(editKedua.getText().toString());
        double pembagian = angkaawal / angkakedua;
        editHasil.setText(pembagian + "");
    }
}
