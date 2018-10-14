package travel.uittrser.go9.go9.View.TrangChu;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import travel.uittrser.go9.go9.R;
import travel.uittrser.go9.go9.View.TrangChu.ListMenu.CaiDat;
import travel.uittrser.go9.go9.View.TrangChu.ListMenu.ChinhSachSuDung;
import travel.uittrser.go9.go9.View.TrangChu.ListMenu.DuongDayNongPackage.DuongDayNong;
import travel.uittrser.go9.go9.View.TrangChu.ListMenu.ListMenu;
import travel.uittrser.go9.go9.View.TrangChu.ListMenu.ListMenuAdapter;
import travel.uittrser.go9.go9.View.TrangChu.ListMenu.PhanHoiSanPham;
import travel.uittrser.go9.go9.View.TrangChu.ListMenu.ThongKe;

public class MenuFragment extends Fragment {

    ListView lvMenu;
    ArrayList<ListMenu> arrayListMenu;
    ListMenuAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_fragment_layout,container,false);

        AnhXa(view);

        adapter = new ListMenuAdapter(getActivity(),R.layout.list_view_menu_list,arrayListMenu);
        lvMenu.setAdapter(adapter);

        lvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nextActivity = null;
                switch (position){
                    case 2:
                        nextActivity = new Intent(getActivity(), ThongKe.class);
                        startActivity(nextActivity);
                        break;
                    case 3:
                        nextActivity = new Intent(getActivity(), CaiDat.class);
                        startActivity(nextActivity);
                        break;
                    case 4:
                        nextActivity = new Intent (getActivity(), PhanHoiSanPham.class);
                        startActivity(nextActivity);
                        break;
                    case 5:
                        nextActivity = new Intent (getActivity(), DuongDayNong.class);
                        startActivity(nextActivity);
                        break;
                    case 6:
                        nextActivity = new Intent(getActivity(), ChinhSachSuDung.class);
                        startActivity(nextActivity);
                        break;
                    case 7:
                        new AlertDialog.Builder(getActivity())
                                .setMessage("Bạn có muốn thoát khỏi ứng dụng ?")
                                .setCancelable(false)
                                .setPositiveButton("Thoát", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        getActivity().finish();
                                    }
                                })
                                .setNegativeButton("Không", null)
                                .show();
                        break;
                    default:
                        Toast.makeText(getActivity(), "Vị trí " + position + " chưa có nội dung !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }


    private void AnhXa(View view) {

        lvMenu = (ListView) view.findViewById(R.id.lvMenu);
        arrayListMenu = new ArrayList<>();
        arrayListMenu.add(new ListMenu("Trang chủ",R.drawable.bottom_nav_home));
        arrayListMenu.add(new ListMenu("Album hành trình",R.drawable.menuicon_album));
        arrayListMenu.add(new ListMenu("Thống kê",R.drawable.menuicon_thongke));
        arrayListMenu.add(new ListMenu("Cài đặt",R.drawable.menuicon_settings));
        arrayListMenu.add(new ListMenu("Phản hồi sản phẩm",R.drawable.menuicon_contact));
        arrayListMenu.add(new ListMenu("Đường dây nóng",R.drawable.menuicon_hotline));
        arrayListMenu.add(new ListMenu("Chính sách sử dụng", R.drawable.menuicon_warning));
        arrayListMenu.add(new ListMenu("Thoát",R.drawable.menuicon_exit));
    }
}
