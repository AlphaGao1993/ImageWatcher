package ch.ielse.demo.p02;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.github.ielse.imagewatcher.ImageWatcher;
import com.github.ielse.imagewatcher.MImage;

class GlideSimpleLoader implements ImageWatcher.Loader {
    @Override
    public void load(Context context, MImage uri, final ImageWatcher.LoadCallback lc) {
        Glide.with(context)
                .asBitmap()
                .load(uri.getUrl())
                .into(new SimpleTarget<Bitmap>() {
                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        lc.onResourceReady(resource);
                    }
                });
    }
}
