package travel.uittrser.go9.go9.View.TrangChu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import travel.uittrser.go9.go9.R;

public class Login extends AppCompatActivity {
    public Button btlogin;
    public Button btlogis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btlogin= (Button) findViewById(R.id.btn_login);
        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Login.this, TrangChuActivity.class);
                startActivity(in);
            }
        });
        btlogis= (Button) findViewById(R.id.btn_logister);
        btlogis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Login.this, Logister.class);
                startActivity(in);
            }
        });
    }
}
