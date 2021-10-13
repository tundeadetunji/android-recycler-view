package com.inovationware.recyclerviewsample;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

public class SwipeModule extends ItemTouchHelper.SimpleCallback {

    CustomAdapter adapter;

    public SwipeModule(int dragDirs, int swipeDirs) {
        super(dragDirs, swipeDirs);
    }

    public SwipeModule(CustomAdapter adapter){
        super(ItemTouchHelper.UP | ItemTouchHelper.DOWN,ItemTouchHelper.LEFT);
        this.adapter = adapter;
    }

    @Override
    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
        this.adapter.RemoveCard(viewHolder.getAdapterPosition());
    }
}
