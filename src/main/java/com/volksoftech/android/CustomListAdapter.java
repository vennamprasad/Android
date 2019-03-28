package com.volksoftech.android;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 08-Mar-18.
 */

public class CustomListAdapter<S> extends BaseAdapter {
    private static LayoutInflater inflater = null;
    private List<String>originalData = null;
    private List<String>filteredData = null;
    private LayoutInflater mInflater;
    private Activity activity;
    private ItemFilter mFilter = new ItemFilter();
    public CustomListAdapter(Home home, ArrayList<String> list) {
        this.originalData = list;
        this.filteredData=list;
        this.activity = home;
    }
    public int getCount() {
        return filteredData.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        Object listData = filteredData.get(position);
        String data = "";
        if (view == null) {
            inflater = activity.getLayoutInflater();
            view = inflater.inflate(R.layout.list_row, null, true);
        }
        TextView title = view.findViewById(R.id.title); // title
        if (listData instanceof String) {
            data = listData.toString();
        }
        title.setText(data);
        return view;
    }
    public Filter getFilter() {
        return mFilter;
    }

    private class ItemFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            String filterString = constraint.toString().toLowerCase();

            FilterResults results = new FilterResults();

            final List<String> list = originalData;

            int count = list.size();
            final ArrayList<String> nlist = new ArrayList<String>(count);

            String filterableString ;

            for (int i = 0; i < count; i++) {
                filterableString = list.get(i);
                if (filterableString.toLowerCase().contains(filterString)) {
                    nlist.add(filterableString);
                }
            }

            results.values = nlist;
            results.count = nlist.size();

            return results;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {filteredData = (ArrayList<String>) results.values;
            notifyDataSetChanged();
        }

    }
}
