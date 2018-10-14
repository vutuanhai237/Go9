package travel.uittrser.go9.go9.View.TrangChu.ListMenu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import travel.uittrser.go9.go9.R;

public class ChinhSachSuDung extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout_chinhsachsudung);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
