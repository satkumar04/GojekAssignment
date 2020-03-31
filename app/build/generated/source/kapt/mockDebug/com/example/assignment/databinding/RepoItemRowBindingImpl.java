package com.example.assignment.databinding;
import com.example.assignment.R;
import com.example.assignment.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RepoItemRowBindingImpl extends RepoItemRowBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.expand_layout, 11);
        sViewsWithIds.put(R.id.header, 12);
        sViewsWithIds.put(R.id.cv_profile_pic, 13);
        sViewsWithIds.put(R.id.cv_child_row, 14);
        sViewsWithIds.put(R.id.cv_languageColor, 15);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RepoItemRowBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private RepoItemRowBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (androidx.cardview.widget.CardView) bindings[15]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.cardview.widget.CardView) bindings[13]
            , (android.widget.TextView) bindings[4]
            , (com.example.assignment.util.ExpandableLayout) bindings[11]
            , (android.widget.RelativeLayout) bindings[12]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            );
        this.cvMain.setTag(null);
        this.descriptionLabel.setTag(null);
        this.imgFork.setTag(null);
        this.imgProfilePic.setTag(null);
        this.imgRating.setTag(null);
        this.ivColor.setTag(null);
        this.tvRepoName.setTag(null);
        this.tvUserName.setTag(null);
        this.txtFork.setTag(null);
        this.txtLanguage.setTag(null);
        this.txtStars.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((com.example.assignment.model.database.entity.User) variable);
        }
        else if (BR.itemClickListener == variableId) {
            setItemClickListener((com.example.assignment.util.ItemClickCallBack) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.example.assignment.model.database.entity.User Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setItemClickListener(@Nullable com.example.assignment.util.ItemClickCallBack ItemClickListener) {
        this.mItemClickListener = ItemClickListener;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.assignment.model.database.entity.User item = mItem;
        java.lang.String integerToStringItemComponent11 = null;
        java.lang.String itemComponent6 = null;
        java.lang.String itemComponent2 = null;
        java.lang.String itemComponent4 = null;
        java.lang.String itemComponent8 = null;
        int itemComponent11 = 0;
        java.lang.String integerToStringItemComponent10 = null;
        java.lang.String itemComponent3 = null;
        java.lang.String itemComponent7 = null;
        int itemComponent10 = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.component6()
                    itemComponent6 = item.component6();
                    // read item.component2()
                    itemComponent2 = item.component2();
                    // read item.component4()
                    itemComponent4 = item.component4();
                    // read item.component8()
                    itemComponent8 = item.component8();
                    // read item.component11()
                    itemComponent11 = item.component11();
                    // read item.component3()
                    itemComponent3 = item.component3();
                    // read item.component7()
                    itemComponent7 = item.component7();
                    // read item.component10()
                    itemComponent10 = item.component10();
                }


                // read Integer.toString(item.component11())
                integerToStringItemComponent11 = java.lang.Integer.toString(itemComponent11);
                // read Integer.toString(item.component10())
                integerToStringItemComponent10 = java.lang.Integer.toString(itemComponent10);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.descriptionLabel.setText(itemComponent6);
            com.example.assignment.ui.base.CustomBindingAdapter.loadImage(this.imgProfilePic, itemComponent4);
            com.example.assignment.ui.base.CustomBindingAdapter.loadColorAsBackGround(this.ivColor, itemComponent8);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRepoName, itemComponent2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserName, itemComponent3);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFork, integerToStringItemComponent10);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLanguage, itemComponent7);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtStars, integerToStringItemComponent11);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgFork, getDrawableFromResource(imgFork, R.drawable.fork_black_16));
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.imgRating, getDrawableFromResource(imgRating, R.drawable.star_yellow_16));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): itemClickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}