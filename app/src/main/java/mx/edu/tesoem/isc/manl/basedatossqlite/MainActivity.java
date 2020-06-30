package mx.edu.tesoem.isc.manl.basedatossqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Lanzar_registr(View v){
        Intent intent = new Intent(this,RegistraActivity.class);
        startActivity(intent);
    }
}
