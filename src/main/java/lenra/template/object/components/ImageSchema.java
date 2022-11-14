
package lenra.template.object.components;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Image
 * <p>
 * Element of type Image
 * 
 */
public class ImageSchema {

    /**
     * The type of the element
     * (Required)
     * 
     */
    @SerializedName("type")
    @Expose
    private ImageSchema.Type type;
    /**
     * The URL to the image. Will fetch the application's image if the URL does not
     * start with `http(s)://`.
     * (Required)
     * 
     */
    @SerializedName("src")
    @Expose
    private String src;
    /**
     * The image width.
     * 
     */
    @SerializedName("width")
    @Expose
    private Double width;
    /**
     * The image height.
     * 
     */
    @SerializedName("height")
    @Expose
    private Double height;
    /**
     * Alignment
     * <p>
     * The alignment to use.
     * 
     */
    @SerializedName("alignment")
    @Expose
    private AlignmentSchema alignment = AlignmentSchema.fromValue("center");
    /**
     * Rect
     * <p>
     * Element of type Rect
     * 
     */
    @SerializedName("centerSlice")
    @Expose
    private RectSchema centerSlice;
    /**
     * The error placeholder when the image encounters an error during loading.
     * 
     */
    @SerializedName("errorPlaceholder")
    @Expose
    private Object errorPlaceholder;
    /**
     * Whether to exclude this image from semantics.
     * 
     */
    @SerializedName("excludeFromSemantics")
    @Expose
    private Boolean excludeFromSemantics = false;
    /**
     * Filter Quality
     * <p>
     * The filter quality to use.
     * 
     */
    @SerializedName("filterQuality")
    @Expose
    private FilterQualitySchema filterQuality = FilterQualitySchema.fromValue("low");
    /**
     * Box Fit
     * <p>
     * How the box should be fitted in its parent.
     * 
     */
    @SerializedName("fit")
    @Expose
    private BoxFitSchema fit = BoxFitSchema.fromValue("contain");
    /**
     * A placeholder to display while the image is loading or to add effects to the
     * image.
     * 
     */
    @SerializedName("framePlaceholder")
    @Expose
    private Object framePlaceholder;
    /**
     * Whether the old image (true) or nothing (false) is shown when the image
     * provider changes.
     * 
     */
    @SerializedName("gaplessPlayback")
    @Expose
    private Boolean gaplessPlayback = false;
    /**
     * Whether to paint the image with anti-aliasing.
     * 
     */
    @SerializedName("isAntiAlias")
    @Expose
    private Boolean isAntiAlias = false;
    /**
     * A placeholder to display while the image is still loading.
     * 
     */
    @SerializedName("loadingPlaceholder")
    @Expose
    private Object loadingPlaceholder;
    /**
     * Image Repeat
     * <p>
     * How the image should be painted on the areas that it does not cover.
     * 
     */
    @SerializedName("repeat")
    @Expose
    private ImageSchema.ImageRepeatSchema repeat = ImageSchema.ImageRepeatSchema.fromValue("noRepeat");
    /**
     * A semantic description of the image. This is used for TalkBack on Android and
     * VoiceOver on IOS.
     * 
     */
    @SerializedName("semanticLabel")
    @Expose
    private String semanticLabel;

    /**
     * The type of the element
     * (Required)
     * 
     */
    public ImageSchema.Type getType() {
        return type;
    }

    /**
     * The type of the element
     * (Required)
     * 
     */
    public void setType(ImageSchema.Type type) {
        this.type = type;
    }

    public ImageSchema withType(ImageSchema.Type type) {
        this.type = type;
        return this;
    }

    /**
     * The URL to the image. Will fetch the application's image if the URL does not
     * start with `http(s)://`.
     * (Required)
     * 
     */
    public String getSrc() {
        return src;
    }

    /**
     * The URL to the image. Will fetch the application's image if the URL does not
     * start with `http(s)://`.
     * (Required)
     * 
     */
    public void setSrc(String src) {
        this.src = src;
    }

    public ImageSchema withSrc(String src) {
        this.src = src;
        return this;
    }

    /**
     * The image width.
     * 
     */
    public Double getWidth() {
        return width;
    }

    /**
     * The image width.
     * 
     */
    public void setWidth(Double width) {
        this.width = width;
    }

    public ImageSchema withWidth(Double width) {
        this.width = width;
        return this;
    }

    /**
     * The image height.
     * 
     */
    public Double getHeight() {
        return height;
    }

    /**
     * The image height.
     * 
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    public ImageSchema withHeight(Double height) {
        this.height = height;
        return this;
    }

    /**
     * Alignment
     * <p>
     * The alignment to use.
     * 
     */
    public AlignmentSchema getAlignment() {
        return alignment;
    }

    /**
     * Alignment
     * <p>
     * The alignment to use.
     * 
     */
    public void setAlignment(AlignmentSchema alignment) {
        this.alignment = alignment;
    }

    public ImageSchema withAlignment(AlignmentSchema alignment) {
        this.alignment = alignment;
        return this;
    }

    /**
     * Rect
     * <p>
     * Element of type Rect
     * 
     */
    public RectSchema getCenterSlice() {
        return centerSlice;
    }

    /**
     * Rect
     * <p>
     * Element of type Rect
     * 
     */
    public void setCenterSlice(RectSchema centerSlice) {
        this.centerSlice = centerSlice;
    }

    public ImageSchema withCenterSlice(RectSchema centerSlice) {
        this.centerSlice = centerSlice;
        return this;
    }

    /**
     * The error placeholder when the image encounters an error during loading.
     * 
     */
    public Object getErrorPlaceholder() {
        return errorPlaceholder;
    }

    /**
     * The error placeholder when the image encounters an error during loading.
     * 
     */
    public void setErrorPlaceholder(Object errorPlaceholder) {
        this.errorPlaceholder = errorPlaceholder;
    }

    public ImageSchema withErrorPlaceholder(Object errorPlaceholder) {
        this.errorPlaceholder = errorPlaceholder;
        return this;
    }

    /**
     * Whether to exclude this image from semantics.
     * 
     */
    public Boolean getExcludeFromSemantics() {
        return excludeFromSemantics;
    }

    /**
     * Whether to exclude this image from semantics.
     * 
     */
    public void setExcludeFromSemantics(Boolean excludeFromSemantics) {
        this.excludeFromSemantics = excludeFromSemantics;
    }

    public ImageSchema withExcludeFromSemantics(Boolean excludeFromSemantics) {
        this.excludeFromSemantics = excludeFromSemantics;
        return this;
    }

    /**
     * Filter Quality
     * <p>
     * The filter quality to use.
     * 
     */
    public FilterQualitySchema getFilterQuality() {
        return filterQuality;
    }

    /**
     * Filter Quality
     * <p>
     * The filter quality to use.
     * 
     */
    public void setFilterQuality(FilterQualitySchema filterQuality) {
        this.filterQuality = filterQuality;
    }

    public ImageSchema withFilterQuality(FilterQualitySchema filterQuality) {
        this.filterQuality = filterQuality;
        return this;
    }

    /**
     * Box Fit
     * <p>
     * How the box should be fitted in its parent.
     * 
     */
    public BoxFitSchema getFit() {
        return fit;
    }

    /**
     * Box Fit
     * <p>
     * How the box should be fitted in its parent.
     * 
     */
    public void setFit(BoxFitSchema fit) {
        this.fit = fit;
    }

    public ImageSchema withFit(BoxFitSchema fit) {
        this.fit = fit;
        return this;
    }

    /**
     * A placeholder to display while the image is loading or to add effects to the
     * image.
     * 
     */
    public Object getFramePlaceholder() {
        return framePlaceholder;
    }

    /**
     * A placeholder to display while the image is loading or to add effects to the
     * image.
     * 
     */
    public void setFramePlaceholder(Object framePlaceholder) {
        this.framePlaceholder = framePlaceholder;
    }

    public ImageSchema withFramePlaceholder(Object framePlaceholder) {
        this.framePlaceholder = framePlaceholder;
        return this;
    }

    /**
     * Whether the old image (true) or nothing (false) is shown when the image
     * provider changes.
     * 
     */
    public Boolean getGaplessPlayback() {
        return gaplessPlayback;
    }

    /**
     * Whether the old image (true) or nothing (false) is shown when the image
     * provider changes.
     * 
     */
    public void setGaplessPlayback(Boolean gaplessPlayback) {
        this.gaplessPlayback = gaplessPlayback;
    }

    public ImageSchema withGaplessPlayback(Boolean gaplessPlayback) {
        this.gaplessPlayback = gaplessPlayback;
        return this;
    }

    /**
     * Whether to paint the image with anti-aliasing.
     * 
     */
    public Boolean getIsAntiAlias() {
        return isAntiAlias;
    }

    /**
     * Whether to paint the image with anti-aliasing.
     * 
     */
    public void setIsAntiAlias(Boolean isAntiAlias) {
        this.isAntiAlias = isAntiAlias;
    }

    public ImageSchema withIsAntiAlias(Boolean isAntiAlias) {
        this.isAntiAlias = isAntiAlias;
        return this;
    }

    /**
     * A placeholder to display while the image is still loading.
     * 
     */
    public Object getLoadingPlaceholder() {
        return loadingPlaceholder;
    }

    /**
     * A placeholder to display while the image is still loading.
     * 
     */
    public void setLoadingPlaceholder(Object loadingPlaceholder) {
        this.loadingPlaceholder = loadingPlaceholder;
    }

    public ImageSchema withLoadingPlaceholder(Object loadingPlaceholder) {
        this.loadingPlaceholder = loadingPlaceholder;
        return this;
    }

    /**
     * Image Repeat
     * <p>
     * How the image should be painted on the areas that it does not cover.
     * 
     */
    public ImageSchema.ImageRepeatSchema getRepeat() {
        return repeat;
    }

    /**
     * Image Repeat
     * <p>
     * How the image should be painted on the areas that it does not cover.
     * 
     */
    public void setRepeat(ImageSchema.ImageRepeatSchema repeat) {
        this.repeat = repeat;
    }

    public ImageSchema withRepeat(ImageSchema.ImageRepeatSchema repeat) {
        this.repeat = repeat;
        return this;
    }

    /**
     * A semantic description of the image. This is used for TalkBack on Android and
     * VoiceOver on IOS.
     * 
     */
    public String getSemanticLabel() {
        return semanticLabel;
    }

    /**
     * A semantic description of the image. This is used for TalkBack on Android and
     * VoiceOver on IOS.
     * 
     */
    public void setSemanticLabel(String semanticLabel) {
        this.semanticLabel = semanticLabel;
    }

    public ImageSchema withSemanticLabel(String semanticLabel) {
        this.semanticLabel = semanticLabel;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImageSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("src");
        sb.append('=');
        sb.append(((this.src == null) ? "<null>" : this.src));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null) ? "<null>" : this.width));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null) ? "<null>" : this.height));
        sb.append(',');
        sb.append("alignment");
        sb.append('=');
        sb.append(((this.alignment == null) ? "<null>" : this.alignment));
        sb.append(',');
        sb.append("centerSlice");
        sb.append('=');
        sb.append(((this.centerSlice == null) ? "<null>" : this.centerSlice));
        sb.append(',');
        sb.append("errorPlaceholder");
        sb.append('=');
        sb.append(((this.errorPlaceholder == null) ? "<null>" : this.errorPlaceholder));
        sb.append(',');
        sb.append("excludeFromSemantics");
        sb.append('=');
        sb.append(((this.excludeFromSemantics == null) ? "<null>" : this.excludeFromSemantics));
        sb.append(',');
        sb.append("filterQuality");
        sb.append('=');
        sb.append(((this.filterQuality == null) ? "<null>" : this.filterQuality));
        sb.append(',');
        sb.append("fit");
        sb.append('=');
        sb.append(((this.fit == null) ? "<null>" : this.fit));
        sb.append(',');
        sb.append("framePlaceholder");
        sb.append('=');
        sb.append(((this.framePlaceholder == null) ? "<null>" : this.framePlaceholder));
        sb.append(',');
        sb.append("gaplessPlayback");
        sb.append('=');
        sb.append(((this.gaplessPlayback == null) ? "<null>" : this.gaplessPlayback));
        sb.append(',');
        sb.append("isAntiAlias");
        sb.append('=');
        sb.append(((this.isAntiAlias == null) ? "<null>" : this.isAntiAlias));
        sb.append(',');
        sb.append("loadingPlaceholder");
        sb.append('=');
        sb.append(((this.loadingPlaceholder == null) ? "<null>" : this.loadingPlaceholder));
        sb.append(',');
        sb.append("repeat");
        sb.append('=');
        sb.append(((this.repeat == null) ? "<null>" : this.repeat));
        sb.append(',');
        sb.append("semanticLabel");
        sb.append('=');
        sb.append(((this.semanticLabel == null) ? "<null>" : this.semanticLabel));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.centerSlice == null) ? 0 : this.centerSlice.hashCode()));
        result = ((result * 31) + ((this.gaplessPlayback == null) ? 0 : this.gaplessPlayback.hashCode()));
        result = ((result * 31) + ((this.filterQuality == null) ? 0 : this.filterQuality.hashCode()));
        result = ((result * 31) + ((this.src == null) ? 0 : this.src.hashCode()));
        result = ((result * 31) + ((this.errorPlaceholder == null) ? 0 : this.errorPlaceholder.hashCode()));
        result = ((result * 31) + ((this.framePlaceholder == null) ? 0 : this.framePlaceholder.hashCode()));
        result = ((result * 31) + ((this.loadingPlaceholder == null) ? 0 : this.loadingPlaceholder.hashCode()));
        result = ((result * 31) + ((this.excludeFromSemantics == null) ? 0 : this.excludeFromSemantics.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.fit == null) ? 0 : this.fit.hashCode()));
        result = ((result * 31) + ((this.isAntiAlias == null) ? 0 : this.isAntiAlias.hashCode()));
        result = ((result * 31) + ((this.repeat == null) ? 0 : this.repeat.hashCode()));
        result = ((result * 31) + ((this.width == null) ? 0 : this.width.hashCode()));
        result = ((result * 31) + ((this.alignment == null) ? 0 : this.alignment.hashCode()));
        result = ((result * 31) + ((this.semanticLabel == null) ? 0 : this.semanticLabel.hashCode()));
        result = ((result * 31) + ((this.height == null) ? 0 : this.height.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImageSchema) == false) {
            return false;
        }
        ImageSchema rhs = ((ImageSchema) other);
        return (((((((((((((((((this.centerSlice == rhs.centerSlice)
                || ((this.centerSlice != null) && this.centerSlice.equals(rhs.centerSlice)))
                && ((this.gaplessPlayback == rhs.gaplessPlayback)
                        || ((this.gaplessPlayback != null) && this.gaplessPlayback.equals(rhs.gaplessPlayback))))
                && ((this.filterQuality == rhs.filterQuality)
                        || ((this.filterQuality != null) && this.filterQuality.equals(rhs.filterQuality))))
                && ((this.src == rhs.src) || ((this.src != null) && this.src.equals(rhs.src))))
                && ((this.errorPlaceholder == rhs.errorPlaceholder)
                        || ((this.errorPlaceholder != null) && this.errorPlaceholder.equals(rhs.errorPlaceholder))))
                && ((this.framePlaceholder == rhs.framePlaceholder)
                        || ((this.framePlaceholder != null) && this.framePlaceholder.equals(rhs.framePlaceholder))))
                && ((this.loadingPlaceholder == rhs.loadingPlaceholder) || ((this.loadingPlaceholder != null)
                        && this.loadingPlaceholder.equals(rhs.loadingPlaceholder))))
                && ((this.excludeFromSemantics == rhs.excludeFromSemantics) || ((this.excludeFromSemantics != null)
                        && this.excludeFromSemantics.equals(rhs.excludeFromSemantics))))
                && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type))))
                && ((this.fit == rhs.fit) || ((this.fit != null) && this.fit.equals(rhs.fit))))
                && ((this.isAntiAlias == rhs.isAntiAlias)
                        || ((this.isAntiAlias != null) && this.isAntiAlias.equals(rhs.isAntiAlias))))
                && ((this.repeat == rhs.repeat) || ((this.repeat != null) && this.repeat.equals(rhs.repeat))))
                && ((this.width == rhs.width) || ((this.width != null) && this.width.equals(rhs.width))))
                && ((this.alignment == rhs.alignment)
                        || ((this.alignment != null) && this.alignment.equals(rhs.alignment))))
                && ((this.semanticLabel == rhs.semanticLabel)
                        || ((this.semanticLabel != null) && this.semanticLabel.equals(rhs.semanticLabel))))
                && ((this.height == rhs.height) || ((this.height != null) && this.height.equals(rhs.height))));
    }

    /**
     * Image Repeat
     * <p>
     * How the image should be painted on the areas that it does not cover.
     * 
     */
    public enum ImageRepeatSchema {

        @SerializedName("noRepeat")
        NO_REPEAT("noRepeat"),
        @SerializedName("repeat")
        REPEAT("repeat"),
        @SerializedName("repeatX")
        REPEAT_X("repeatX"),
        @SerializedName("repeatY")
        REPEAT_Y("repeatY");

        private final String value;
        private final static Map<String, ImageSchema.ImageRepeatSchema> CONSTANTS = new HashMap<String, ImageSchema.ImageRepeatSchema>();

        static {
            for (ImageSchema.ImageRepeatSchema c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ImageRepeatSchema(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ImageSchema.ImageRepeatSchema fromValue(String value) {
            ImageSchema.ImageRepeatSchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    /**
     * The type of the element
     * 
     */
    public enum Type {

        @SerializedName("image")
        IMAGE("image");

        private final String value;
        private final static Map<String, ImageSchema.Type> CONSTANTS = new HashMap<String, ImageSchema.Type>();

        static {
            for (ImageSchema.Type c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public String value() {
            return this.value;
        }

        public static ImageSchema.Type fromValue(String value) {
            ImageSchema.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
