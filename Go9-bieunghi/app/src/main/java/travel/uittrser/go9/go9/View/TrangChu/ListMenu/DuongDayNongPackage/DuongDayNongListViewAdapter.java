package travel.uittrser.go9.go9.View.TrangChu.ListMenu.DuongDayNongPackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import travel.uittrser.go9.go9.R;

public class DuongDayNongListViewAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<DuongDayNongListView> duongDayNongListViewList;

    public DuongDayNongListViewAdapter(Context context, int layout, List<DuongDayNongListView> duongDayNongListViewList) {
        this.context = context;
        this.layout = layout;
        this.duongDayNongListViewList = duongDayNongListViewList;
    }

    @Override
    public int getCount() {
        return duongDayNongListViewList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);

        //ánh xạ view.
        TextView txtTen = (TextView)convertView.findViewById(R.id.textViewTenDuongDayNong);
        TextView txtSDT = (TextView)convertView.findViewById(R.id.textViewSoDienThoai);
        ImageView imageIconDuongDayNong = (ImageView)convertView.findViewById(R.id.imageViewIconDuongDayNong);
        ImageView imageIconPhone = (ImageView)convertView.findViewById(R.id.imageViewIconDienThoai);

        //gán giá trị.
        DuongDayNongListView ddnItem = duongDayNongListViewList.get(position);

        txtTen.setText(ddnItem.getTen());
        txtSDT.setText(ddnItem.getSDT());
        imageIconDuongDayNong.setImageResource(ddnItem.getHinhDaiDien());
        imageIconPhone.setImageResource(R.drawable.menuicon_hotline);

        return convertView;
    }
}
