package com.example.recycleviewwords;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment4.R;

import java.util.LinkedList;

public class WordListAdapter extends
        RecyclerView.Adapter<WordListAdapter.WordViewHolder>  {
    private final LinkedList<String> mWordList;
    private final LinkedList<String> descList;
    private LayoutInflater mInflater;
    private Context context1;

    public WordListAdapter(Context context, LinkedList<String> wordList, LinkedList<String> desc) {
        context1 = context;
        mInflater = LayoutInflater.from(context);
        this.descList = desc;
        this.mWordList = wordList;
    }

    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.wordlist_item,
                parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        String desc = descList.get(position);
        holder.wordItemView.setText(mCurrent);
        holder.recDesc.setText(desc);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }


    private void getLayoutPosition() {
    }

    public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView wordItemView;
        public final TextView recDesc;
        final WordListAdapter mAdapter;
        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            recDesc = itemView.findViewById(R.id.desc);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
           /* // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
            // Use that to access the affected item in mWordList.
            String element = mWordList.get(mPosition);
            // Change the word in the mWordList.
            mWordList.set(mPosition, "Clicked! " + element);
            // Notify the adapter, that the data has changed so it can
            // update the RecyclerView to display the data.
            mAdapter.notifyDataSetChanged(); */

            int mPosition = getLayoutPosition();
            String element = mWordList.get(mPosition);
            Intent intent = new Intent(context1, recipePage.class);
            context1.startActivity(intent);


        }
    }
}