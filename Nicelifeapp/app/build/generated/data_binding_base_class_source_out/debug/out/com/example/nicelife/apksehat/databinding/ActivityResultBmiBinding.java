// Generated by view binder compiler. Do not edit!
package com.example.nicelife.apksehat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.nicelife.apksehat.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityResultBmiBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout background;

  @NonNull
  public final TextView bmicategoryadvice;

  @NonNull
  public final TextView bmicategorydispaly;

  @NonNull
  public final TextView bmidisplay;

  @NonNull
  public final RelativeLayout contentlayout;

  @NonNull
  public final TextView food;

  @NonNull
  public final TextView genderdisplay;

  @NonNull
  public final Button gotomain;

  @NonNull
  public final ImageView imageview;

  @NonNull
  public final TextView infoneeds;

  @NonNull
  public final TextView sleep;

  @NonNull
  public final TextView water;

  private ActivityResultBmiBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout background, @NonNull TextView bmicategoryadvice,
      @NonNull TextView bmicategorydispaly, @NonNull TextView bmidisplay,
      @NonNull RelativeLayout contentlayout, @NonNull TextView food,
      @NonNull TextView genderdisplay, @NonNull Button gotomain, @NonNull ImageView imageview,
      @NonNull TextView infoneeds, @NonNull TextView sleep, @NonNull TextView water) {
    this.rootView = rootView;
    this.background = background;
    this.bmicategoryadvice = bmicategoryadvice;
    this.bmicategorydispaly = bmicategorydispaly;
    this.bmidisplay = bmidisplay;
    this.contentlayout = contentlayout;
    this.food = food;
    this.genderdisplay = genderdisplay;
    this.gotomain = gotomain;
    this.imageview = imageview;
    this.infoneeds = infoneeds;
    this.sleep = sleep;
    this.water = water;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityResultBmiBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityResultBmiBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_result_bmi, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityResultBmiBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout background = (RelativeLayout) rootView;

      id = R.id.bmicategoryadvice;
      TextView bmicategoryadvice = ViewBindings.findChildViewById(rootView, id);
      if (bmicategoryadvice == null) {
        break missingId;
      }

      id = R.id.bmicategorydispaly;
      TextView bmicategorydispaly = ViewBindings.findChildViewById(rootView, id);
      if (bmicategorydispaly == null) {
        break missingId;
      }

      id = R.id.bmidisplay;
      TextView bmidisplay = ViewBindings.findChildViewById(rootView, id);
      if (bmidisplay == null) {
        break missingId;
      }

      id = R.id.contentlayout;
      RelativeLayout contentlayout = ViewBindings.findChildViewById(rootView, id);
      if (contentlayout == null) {
        break missingId;
      }

      id = R.id.food;
      TextView food = ViewBindings.findChildViewById(rootView, id);
      if (food == null) {
        break missingId;
      }

      id = R.id.genderdisplay;
      TextView genderdisplay = ViewBindings.findChildViewById(rootView, id);
      if (genderdisplay == null) {
        break missingId;
      }

      id = R.id.gotomain;
      Button gotomain = ViewBindings.findChildViewById(rootView, id);
      if (gotomain == null) {
        break missingId;
      }

      id = R.id.imageview;
      ImageView imageview = ViewBindings.findChildViewById(rootView, id);
      if (imageview == null) {
        break missingId;
      }

      id = R.id.infoneeds;
      TextView infoneeds = ViewBindings.findChildViewById(rootView, id);
      if (infoneeds == null) {
        break missingId;
      }

      id = R.id.sleep;
      TextView sleep = ViewBindings.findChildViewById(rootView, id);
      if (sleep == null) {
        break missingId;
      }

      id = R.id.water;
      TextView water = ViewBindings.findChildViewById(rootView, id);
      if (water == null) {
        break missingId;
      }

      return new ActivityResultBmiBinding((RelativeLayout) rootView, background, bmicategoryadvice,
          bmicategorydispaly, bmidisplay, contentlayout, food, genderdisplay, gotomain, imageview,
          infoneeds, sleep, water);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}