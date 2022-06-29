package com.example.demo.vo;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPlaceImage is a Querydsl query type for PlaceImage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlaceImage extends EntityPathBase<PlaceImage> {

    private static final long serialVersionUID = -370211377L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPlaceImage placeImage = new QPlaceImage("placeImage");

    public final QPlace place;

    public final StringPath place_image_file = createString("place_image_file");

    public final NumberPath<Integer> place_image_num = createNumber("place_image_num", Integer.class);

    public QPlaceImage(String variable) {
        this(PlaceImage.class, forVariable(variable), INITS);
    }

    public QPlaceImage(Path<? extends PlaceImage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPlaceImage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPlaceImage(PathMetadata metadata, PathInits inits) {
        this(PlaceImage.class, metadata, inits);
    }

    public QPlaceImage(Class<? extends PlaceImage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.place = inits.isInitialized("place") ? new QPlace(forProperty("place")) : null;
    }

}

