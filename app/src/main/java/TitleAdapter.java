import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import m.thenewsguy.R;

/**
 * Created by Michelle on 12-10-2018.
 */

public class TitleAdapter extends ArrayAdapter<Title>{
    public TitleAdapter(@NonNull Context context, @NonNull ArrayList<Title> title) {
        super(context, 0, title);
    }
    @Override
    public View getView(int pos, View v, ViewGroup parent)
    {
        View listView = v;
        if(listView == null){
            listView = LayoutInflater.from(getContext()).inflate(R.layout.activity_title,parent,false);
        }
        Title current = getItem(pos);

        TextView arttitle = (TextView) listView.findViewById(R.id.articleTitle);
        arttitle.setText(current.getTitle());

        return listView;

    }

    public Title getItem(int position){
        return super.getItem(position);
    }
}
