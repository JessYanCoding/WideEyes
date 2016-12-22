package me.jess.arms.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.jess.arms.widget.imageloader.BaseImageLoaderStrategy;
import me.jess.arms.widget.imageloader.ImageLoader;
import me.jess.arms.widget.imageloader.glide.GlideImageLoaderStrategy;

/**
 * Created by jess on 8/5/16 16:10
 * contact with jess.yan.effort@gmail.com
 */
@Module
public class ImageModule {

    @Singleton
    @Provides
    public BaseImageLoaderStrategy provideImageLoaderStrategy() {
        return new GlideImageLoaderStrategy();
    }

    @Singleton
    @Provides
    public ImageLoader provideImageLoader(BaseImageLoaderStrategy strategy) {
        return new ImageLoader(strategy);
    }
}
