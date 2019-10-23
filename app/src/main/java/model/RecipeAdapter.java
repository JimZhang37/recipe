package model;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipe.R;

import java.util.ArrayList;
import java.util.List;

import data.Recipe;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder> {
    private String TAG = this.getClass().getSimpleName();
    private List<Recipe> mRecipeList;
    private ListItemClickListener mListItemClickListener;

    public RecipeAdapter(ListItemClickListener listItemClickListener) {
        mListItemClickListener = listItemClickListener;
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeAdapter.RecipeViewHolder holder, int position) {
        holder.mTextView.setText(mRecipeList.get(position).getName());
    }

    @NonNull
    @Override
    public RecipeAdapter.RecipeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.recipe_viewholder;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        RecipeViewHolder viewHolder = new RecipeViewHolder(view);

        return viewHolder;
    }

    @Override
    public int getItemCount() {
        if (mRecipeList == null) {
            return 0;
        }
        return mRecipeList.size();

    }

    public void setData(List<Recipe> recipes) {
        mRecipeList = recipes;
        notifyDataSetChanged();
    }

    public interface ListItemClickListener {
        void onListItemClick(int clickedItemIndex);
    }

    class RecipeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView mTextView;

        public RecipeViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.recipe_tv);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            //TODO
            int clickPosition = getAdapterPosition();
            Log.d(TAG, "number of item is " + String.valueOf(getItemCount()));
            mListItemClickListener.onListItemClick(clickPosition);
        }
    }
}
