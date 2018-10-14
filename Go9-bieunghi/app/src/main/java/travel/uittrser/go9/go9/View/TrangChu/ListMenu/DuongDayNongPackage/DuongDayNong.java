package travel.uittrser.go9.go9.View.TrangChu.ListMenu.DuongDayNongPackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import travel.uittrser.go9.go9.R;

public class DuongDayNong extends AppCompatActivity {

    ListView lvDuongDayNong;
    ArrayList<DuongDayNongListView> arrayItemDuongDayNong;
    DuongDayNongListViewAdapter adapter;
    ImageView iconAn;
    ImageView iconNgu;
    ImageView iconTaxi;
    ImageView iconTroChoi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout_duongdaynong);

        AnhXa();

        adapter = new DuongDayNongListViewAdapter(this,R.layout.menu_layout_duongdaynong_layout,arrayItemDuongDayNong);
        lvDuongDayNong.setAdapter(adapter);

        onLongClickListener();

        lvDuongDayNong.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String phoneToTel = null;
                Intent phoneNumToCall = new Intent(Intent.ACTION_DIAL);
                switch (position){
                    case 0:
                        phoneToTel = "tel:113";
                        break;
                    case 1:
                        phoneToTel = "tel:114";
                        break;
                    case 2:
                        phoneToTel = "tel:115";
                        break;
                }
                phoneNumToCall.setData(Uri.parse(phoneToTel));
                startActivity(phoneNumToCall);
            }
        });
    }

    private void onLongClickListener() {
        iconAn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(DuongDayNong.this, "Các địa điểm ăn uống", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        iconTaxi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(DuongDayNong.this, "Các hãng taxi tin cậy", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        iconNgu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(DuongDayNong.this, "Các địa điểm dừng chân, khách sạn, nhà nghỉ", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        iconTroChoi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(DuongDayNong.this, "Các địa điểm vui chơi giải trí khác", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    public void chonTinhNang(View view){
        switch (view.getId()){
            case R.id.iconAn:
                //Chỉnh lại tô đậm đối với lựa chọn tương ứng.
                iconAn.setImageResource(R.drawable.menuicon_duongdaynong_anuong_inverted);
                iconNgu.setImageResource(R.drawable.menuicon_duongdaynong_iconphongngu);
                iconTaxi.setImageResource(R.drawable.menuicon_duongdaynong_taxi);
                iconTroChoi.setImageResource(R.drawable.menuicon_duongdaynong_trochoi);
                break;
            case R.id.iconNgu:
                //Chỉnh lại tô đậm đối với lựa chọn tương ứng.
                iconAn.setImageResource(R.drawable.menuicon_duongdaynong_anuong);
                iconNgu.setImageResource(R.drawable.menuicon_duongdaynong_iconphongngu_inverted);
                iconTaxi.setImageResource(R.drawable.menuicon_duongdaynong_taxi);
                iconTroChoi.setImageResource(R.drawable.menuicon_duongdaynong_trochoi);
                break;
            case R.id.iconTaxi:
                //Chỉnh lại tô đậm đối với lựa chọn tương ứng.
                iconAn.setImageResource(R.drawable.menuicon_duongdaynong_anuong);
                iconNgu.setImageResource(R.drawable.menuicon_duongdaynong_iconphongngu);
                iconTaxi.setImageResource(R.drawable.menuicon_duongdaynong_taxi_inverted);
                iconTroChoi.setImageResource(R.drawable.menuicon_duongdaynong_trochoi);
                break;
            case R.id.iconTroChoi:
                //Chỉnh lại tô đậm đối với lựa chọn tương ứng.
                iconAn.setImageResource(R.drawable.menuicon_duongdaynong_anuong);
                iconNgu.setImageResource(R.drawable.menuicon_duongdaynong_iconphongngu);
                iconTaxi.setImageResource(R.drawable.menuicon_duongdaynong_taxi);
                iconTroChoi.setImageResource(R.drawable.menuicon_duongdaynong_trochoi_inverted);
                break;
        }
    }
    private void AnhXa() {

        lvDuongDayNong = (ListView) findViewById(R.id.listViewDuongDayNongEmergency);
        arrayItemDuongDayNong = new ArrayList<>();
        arrayItemDuongDayNong.add(new DuongDayNongListView("Công an","113",R.drawable.menuicon_hotline_police_icon));
        arrayItemDuongDayNong.add(new DuongDayNongListView("Cứu hỏa","114",R.drawable.menuicon_hotline_fire));
        arrayItemDuongDayNong.add(new DuongDayNongListView("Cứu thương","115",R.drawable.menuicon_hotline_hospitalbuildings));
        iconAn = (ImageView) findViewById(R.id.iconAn);
        iconNgu = (ImageView) findViewById(R.id.iconNgu);
        iconTaxi = (ImageView) findViewById(R.id.iconTaxi);
        iconTroChoi = (ImageView) findViewById(R.id.iconTroChoi);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
