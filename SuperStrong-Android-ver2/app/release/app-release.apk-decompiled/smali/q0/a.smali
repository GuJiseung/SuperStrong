.class public final Lq0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq0/a$b;,
        Lq0/a$d;,
        Lq0/a$c;,
        Lq0/a$e;
    }
.end annotation


# static fields
.field public static final A:[B

.field public static final B:[B

.field public static final C:[Ljava/lang/String;

.field public static final D:[I

.field public static final E:[B

.field public static final F:Lq0/a$d;

.field public static final G:[[Lq0/a$d;

.field public static final H:[Lq0/a$d;

.field public static final I:[Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Lq0/a$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final J:[Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lq0/a$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final K:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final L:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final M:Ljava/nio/charset/Charset;

.field public static final N:[B

.field public static final O:[B

.field public static final m:Z

.field public static final n:[I

.field public static final o:[I

.field public static final p:[B

.field public static final q:[B

.field public static final r:[B

.field public static final s:[B

.field public static final t:[B

.field public static final u:[B

.field public static final v:[B

.field public static final w:[B

.field public static final x:[B

.field public static final y:[B

.field public static final z:[B


# instance fields
.field public final a:Ljava/io/FileDescriptor;

.field public final b:Landroid/content/res/AssetManager$AssetInputStream;

.field public c:I

.field public final d:[Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lq0/a$c;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/HashSet;

.field public f:Ljava/nio/ByteOrder;

.field public g:Z

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I


# direct methods
.method public static constructor <clinit>()V
    .locals 29

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "ExifInterface"

    invoke-static {v2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    sput-boolean v2, Lq0/a;->m:Z

    const/4 v2, 0x4

    new-array v3, v2, [Ljava/lang/Integer;

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v3, v6

    const/4 v7, 0x6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v3, v4

    const/4 v8, 0x2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v1, v3, v8

    const/16 v10, 0x8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    aput-object v11, v3, v0

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    new-array v3, v2, [Ljava/lang/Integer;

    aput-object v9, v3, v6

    const/4 v12, 0x7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    aput-object v12, v3, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v3, v8

    const/4 v13, 0x5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v3, v0

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    new-array v3, v0, [I

    fill-array-data v3, :array_0

    sput-object v3, Lq0/a;->n:[I

    new-array v3, v4, [I

    aput v10, v3, v6

    sput-object v3, Lq0/a;->o:[I

    new-array v3, v0, [B

    fill-array-data v3, :array_1

    sput-object v3, Lq0/a;->p:[B

    new-array v3, v2, [B

    fill-array-data v3, :array_2

    sput-object v3, Lq0/a;->q:[B

    new-array v3, v2, [B

    fill-array-data v3, :array_3

    sput-object v3, Lq0/a;->r:[B

    new-array v3, v2, [B

    fill-array-data v3, :array_4

    sput-object v3, Lq0/a;->s:[B

    new-array v3, v7, [B

    fill-array-data v3, :array_5

    sput-object v3, Lq0/a;->t:[B

    const/16 v3, 0xa

    new-array v3, v3, [B

    fill-array-data v3, :array_6

    sput-object v3, Lq0/a;->u:[B

    new-array v3, v10, [B

    fill-array-data v3, :array_7

    sput-object v3, Lq0/a;->v:[B

    new-array v3, v2, [B

    fill-array-data v3, :array_8

    sput-object v3, Lq0/a;->w:[B

    new-array v3, v2, [B

    fill-array-data v3, :array_9

    sput-object v3, Lq0/a;->x:[B

    new-array v3, v2, [B

    fill-array-data v3, :array_a

    sput-object v3, Lq0/a;->y:[B

    new-array v3, v2, [B

    fill-array-data v3, :array_b

    sput-object v3, Lq0/a;->z:[B

    new-array v3, v2, [B

    fill-array-data v3, :array_c

    sput-object v3, Lq0/a;->A:[B

    new-array v3, v2, [B

    fill-array-data v3, :array_d

    sput-object v3, Lq0/a;->B:[B

    const-string v3, "VP8X"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    const-string v3, "VP8L"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    const-string v3, "VP8 "

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    const-string v3, "ANIM"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    const-string v3, "ANMF"

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    const-string v3, "XMP "

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    const-string v15, ""

    const-string v16, "BYTE"

    const-string v17, "STRING"

    const-string v18, "USHORT"

    const-string v19, "ULONG"

    const-string v20, "URATIONAL"

    const-string v21, "SBYTE"

    const-string v22, "UNDEFINED"

    const-string v23, "SSHORT"

    const-string v24, "SLONG"

    const-string v25, "SRATIONAL"

    const-string v26, "SINGLE"

    const-string v27, "DOUBLE"

    const-string v28, "IFD"

    filled-new-array/range {v15 .. v28}, [Ljava/lang/String;

    move-result-object v3

    sput-object v3, Lq0/a;->C:[Ljava/lang/String;

    const/16 v3, 0xe

    new-array v3, v3, [I

    fill-array-data v3, :array_e

    sput-object v3, Lq0/a;->D:[I

    new-array v3, v10, [B

    fill-array-data v3, :array_f

    sput-object v3, Lq0/a;->E:[B

    const/16 v3, 0x2a

    new-array v3, v3, [Lq0/a$d;

    new-instance v7, Lq0/a$d;

    const-string v10, "NewSubfileType"

    const/16 v15, 0xfe

    invoke-direct {v7, v15, v2, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v7, v3, v6

    new-instance v6, Lq0/a$d;

    const-string v7, "SubfileType"

    const/16 v10, 0xff

    invoke-direct {v6, v10, v2, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v6, v3, v4

    new-instance v6, Lq0/a$d;

    const-string v7, "ImageWidth"

    const/16 v10, 0x100

    invoke-direct {v6, v10, v7}, Lq0/a$d;-><init>(ILjava/lang/String;)V

    aput-object v6, v3, v8

    new-instance v6, Lq0/a$d;

    const-string v7, "ImageLength"

    const/16 v10, 0x101

    invoke-direct {v6, v10, v7}, Lq0/a$d;-><init>(ILjava/lang/String;)V

    aput-object v6, v3, v0

    new-instance v6, Lq0/a$d;

    const-string v7, "BitsPerSample"

    const/16 v10, 0x102

    invoke-direct {v6, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v6, v3, v2

    new-instance v6, Lq0/a$d;

    const-string v7, "Compression"

    const/16 v10, 0x103

    invoke-direct {v6, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v6, v3, v13

    new-instance v6, Lq0/a$d;

    const-string v7, "PhotometricInterpretation"

    const/16 v10, 0x106

    invoke-direct {v6, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v7, 0x6

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "ImageDescription"

    const/16 v10, 0x10e

    invoke-direct {v6, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v7, 0x7

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "Make"

    const/16 v10, 0x10f

    invoke-direct {v6, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x8

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "Model"

    const/16 v10, 0x110

    invoke-direct {v6, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x9

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "StripOffsets"

    const/16 v10, 0x111

    invoke-direct {v6, v10, v7}, Lq0/a$d;-><init>(ILjava/lang/String;)V

    const/16 v7, 0xa

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "Orientation"

    const/16 v10, 0x112

    invoke-direct {v6, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0xb

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "SamplesPerPixel"

    const/16 v10, 0x115

    invoke-direct {v6, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0xc

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "RowsPerStrip"

    const/16 v10, 0x116

    invoke-direct {v6, v10, v7}, Lq0/a$d;-><init>(ILjava/lang/String;)V

    const/16 v7, 0xd

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "StripByteCounts"

    const/16 v10, 0x117

    invoke-direct {v6, v10, v7}, Lq0/a$d;-><init>(ILjava/lang/String;)V

    const/16 v7, 0xe

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "XResolution"

    const/16 v10, 0x11a

    invoke-direct {v6, v10, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0xf

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "YResolution"

    const/16 v10, 0x11b

    invoke-direct {v6, v10, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x10

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "PlanarConfiguration"

    const/16 v10, 0x11c

    invoke-direct {v6, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x11

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "ResolutionUnit"

    const/16 v10, 0x128

    invoke-direct {v6, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x12

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "TransferFunction"

    const/16 v10, 0x12d

    invoke-direct {v6, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x13

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "Software"

    const/16 v10, 0x131

    invoke-direct {v6, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x14

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "DateTime"

    const/16 v10, 0x132

    invoke-direct {v6, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x15

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "Artist"

    const/16 v10, 0x13b

    invoke-direct {v6, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x16

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "WhitePoint"

    const/16 v10, 0x13e

    invoke-direct {v6, v10, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x17

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v10, "PrimaryChromaticities"

    const/16 v15, 0x13f

    invoke-direct {v6, v15, v13, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x18

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "SubIFDPointer"

    const/16 v15, 0x14a

    invoke-direct {v6, v15, v2, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x19

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "JPEGInterchangeFormat"

    const/16 v15, 0x201

    invoke-direct {v6, v15, v2, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x1a

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "JPEGInterchangeFormatLength"

    const/16 v15, 0x202

    invoke-direct {v6, v15, v2, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x1b

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "YCbCrCoefficients"

    const/16 v15, 0x211

    invoke-direct {v6, v15, v13, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x1c

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "YCbCrSubSampling"

    const/16 v15, 0x212

    invoke-direct {v6, v15, v0, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x1d

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "YCbCrPositioning"

    const/16 v15, 0x213

    invoke-direct {v6, v15, v0, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x1e

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "ReferenceBlackWhite"

    const/16 v15, 0x214

    invoke-direct {v6, v15, v13, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x1f

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "Copyright"

    const v15, 0x8298

    invoke-direct {v6, v15, v8, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x20

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "ExifIFDPointer"

    const v15, 0x8769

    invoke-direct {v6, v15, v2, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x21

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "GPSInfoIFDPointer"

    const v15, 0x8825

    invoke-direct {v6, v15, v2, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x22

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "SensorTopBorder"

    invoke-direct {v6, v2, v2, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x23

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "SensorLeftBorder"

    invoke-direct {v6, v13, v2, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x24

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "SensorBottomBorder"

    const/4 v15, 0x6

    invoke-direct {v6, v15, v2, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x25

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "SensorRightBorder"

    const/4 v15, 0x7

    invoke-direct {v6, v15, v2, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v10, 0x26

    aput-object v6, v3, v10

    new-instance v6, Lq0/a$d;

    const-string v10, "ISO"

    invoke-direct {v6, v7, v0, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x27

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "JpgFromRaw"

    const/16 v10, 0x2e

    invoke-direct {v6, v10, v15, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x28

    aput-object v6, v3, v7

    new-instance v6, Lq0/a$d;

    const-string v7, "Xmp"

    const/16 v10, 0x2bc

    invoke-direct {v6, v10, v4, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x29

    aput-object v6, v3, v7

    const/16 v6, 0x4a

    new-array v6, v6, [Lq0/a$d;

    new-instance v7, Lq0/a$d;

    const-string v10, "ExposureTime"

    const v15, 0x829a

    invoke-direct {v7, v15, v13, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v10, 0x0

    aput-object v7, v6, v10

    new-instance v7, Lq0/a$d;

    const-string v10, "FNumber"

    const v15, 0x829d

    invoke-direct {v7, v15, v13, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v7, v6, v4

    new-instance v4, Lq0/a$d;

    const-string v7, "ExposureProgram"

    const v10, 0x8822

    invoke-direct {v4, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v6, v8

    new-instance v4, Lq0/a$d;

    const-string v7, "SpectralSensitivity"

    const v10, 0x8824

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v6, v0

    new-instance v4, Lq0/a$d;

    const-string v7, "PhotographicSensitivity"

    const v10, 0x8827

    invoke-direct {v4, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v6, v2

    new-instance v4, Lq0/a$d;

    const-string v7, "OECF"

    const v10, 0x8828

    const/4 v15, 0x7

    invoke-direct {v4, v10, v15, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v6, v13

    new-instance v4, Lq0/a$d;

    const-string v7, "SensitivityType"

    const v10, 0x8830

    invoke-direct {v4, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v7, 0x6

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "StandardOutputSensitivity"

    const v10, 0x8831

    invoke-direct {v4, v10, v2, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v6, v15

    new-instance v4, Lq0/a$d;

    const-string v7, "RecommendedExposureIndex"

    const v10, 0x8832

    invoke-direct {v4, v10, v2, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x8

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "ISOSpeed"

    const v10, 0x8833

    invoke-direct {v4, v10, v2, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x9

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "ISOSpeedLatitudeyyy"

    const v10, 0x8834

    invoke-direct {v4, v10, v2, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0xa

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "ISOSpeedLatitudezzz"

    const v10, 0x8835

    invoke-direct {v4, v10, v2, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0xb

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "ExifVersion"

    const v10, 0x9000

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0xc

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "DateTimeOriginal"

    const v10, 0x9003

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0xd

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "DateTimeDigitized"

    const v10, 0x9004

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0xe

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "OffsetTime"

    const v10, 0x9010

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0xf

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "OffsetTimeOriginal"

    const v10, 0x9011

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x10

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "OffsetTimeDigitized"

    const v10, 0x9012

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x11

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "ComponentsConfiguration"

    const v10, 0x9101

    invoke-direct {v4, v10, v15, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x12

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "CompressedBitsPerPixel"

    const v10, 0x9102

    invoke-direct {v4, v10, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x13

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "ShutterSpeedValue"

    const v10, 0x9201

    const/16 v15, 0xa

    invoke-direct {v4, v10, v15, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x14

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "ApertureValue"

    const v10, 0x9202

    invoke-direct {v4, v10, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x15

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "BrightnessValue"

    const v10, 0x9203

    invoke-direct {v4, v10, v15, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x16

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "ExposureBiasValue"

    const v10, 0x9204

    invoke-direct {v4, v10, v15, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x17

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "MaxApertureValue"

    const v10, 0x9205

    invoke-direct {v4, v10, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x18

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "SubjectDistance"

    const v10, 0x9206

    invoke-direct {v4, v10, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x19

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "MeteringMode"

    const v10, 0x9207

    invoke-direct {v4, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x1a

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "LightSource"

    const v10, 0x9208

    invoke-direct {v4, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x1b

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "Flash"

    const v10, 0x9209

    invoke-direct {v4, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x1c

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "FocalLength"

    const v10, 0x920a

    invoke-direct {v4, v10, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x1d

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "SubjectArea"

    const v10, 0x9214

    invoke-direct {v4, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x1e

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "MakerNote"

    const v10, 0x927c

    const/4 v15, 0x7

    invoke-direct {v4, v10, v15, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x1f

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "UserComment"

    const v10, 0x9286

    invoke-direct {v4, v10, v15, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x20

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "SubSecTime"

    const v10, 0x9290

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x21

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "SubSecTimeOriginal"

    const v10, 0x9291

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x22

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "SubSecTimeDigitized"

    const v10, 0x9292

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x23

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "FlashpixVersion"

    const v10, 0xa000

    invoke-direct {v4, v10, v15, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x24

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "ColorSpace"

    const v10, 0xa001

    invoke-direct {v4, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x25

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "PixelXDimension"

    const v10, 0xa002

    invoke-direct {v4, v10, v7}, Lq0/a$d;-><init>(ILjava/lang/String;)V

    const/16 v7, 0x26

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "PixelYDimension"

    const v10, 0xa003

    invoke-direct {v4, v10, v7}, Lq0/a$d;-><init>(ILjava/lang/String;)V

    const/16 v7, 0x27

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "RelatedSoundFile"

    const v10, 0xa004

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v7, 0x28

    aput-object v4, v6, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "InteroperabilityIFDPointer"

    const v10, 0xa005

    invoke-direct {v4, v10, v2, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v2, 0x29

    aput-object v4, v6, v2

    new-instance v2, Lq0/a$d;

    const-string v4, "FlashEnergy"

    const v7, 0xa20b

    invoke-direct {v2, v7, v13, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x2a

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "SpatialFrequencyResponse"

    const v7, 0xa20c

    const/4 v10, 0x7

    invoke-direct {v2, v7, v10, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x2b

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "FocalPlaneXResolution"

    const v7, 0xa20e

    invoke-direct {v2, v7, v13, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x2c

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "FocalPlaneYResolution"

    const v7, 0xa20f

    invoke-direct {v2, v7, v13, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x2d

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "FocalPlaneResolutionUnit"

    const v7, 0xa210

    invoke-direct {v2, v7, v0, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x2e

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "SubjectLocation"

    const v7, 0xa214

    invoke-direct {v2, v7, v0, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x2f

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "ExposureIndex"

    const v7, 0xa215

    invoke-direct {v2, v7, v13, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x30

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "SensingMethod"

    const v7, 0xa217

    invoke-direct {v2, v7, v0, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x31

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "FileSource"

    const v7, 0xa300

    invoke-direct {v2, v7, v10, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x32

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "SceneType"

    const v7, 0xa301

    invoke-direct {v2, v7, v10, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x33

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "CFAPattern"

    const v7, 0xa302

    invoke-direct {v2, v7, v10, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x34

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "CustomRendered"

    const v7, 0xa401

    invoke-direct {v2, v7, v0, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x35

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "ExposureMode"

    const v7, 0xa402

    invoke-direct {v2, v7, v0, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x36

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "WhiteBalance"

    const v7, 0xa403

    invoke-direct {v2, v7, v0, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x37

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "DigitalZoomRatio"

    const v7, 0xa404

    invoke-direct {v2, v7, v13, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x38

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "FocalLengthIn35mmFilm"

    const v7, 0xa405

    invoke-direct {v2, v7, v0, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x39

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "SceneCaptureType"

    const v7, 0xa406

    invoke-direct {v2, v7, v0, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x3a

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "GainControl"

    const v7, 0xa407

    invoke-direct {v2, v7, v0, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x3b

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "Contrast"

    const v7, 0xa408

    invoke-direct {v2, v7, v0, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x3c

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "Saturation"

    const v7, 0xa409

    invoke-direct {v2, v7, v0, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x3d

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "Sharpness"

    const v7, 0xa40a

    invoke-direct {v2, v7, v0, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x3e

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "DeviceSettingDescription"

    const v7, 0xa40b

    invoke-direct {v2, v7, v10, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x3f

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "SubjectDistanceRange"

    const v7, 0xa40c

    invoke-direct {v2, v7, v0, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x40

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "ImageUniqueID"

    const v7, 0xa420

    invoke-direct {v2, v7, v8, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x41

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "CameraOwnerName"

    const v7, 0xa430

    invoke-direct {v2, v7, v8, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x42

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "BodySerialNumber"

    const v7, 0xa431

    invoke-direct {v2, v7, v8, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x43

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "LensSpecification"

    const v7, 0xa432

    invoke-direct {v2, v7, v13, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x44

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "LensMake"

    const v7, 0xa433

    invoke-direct {v2, v7, v8, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x45

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "LensModel"

    const v7, 0xa434

    invoke-direct {v2, v7, v8, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x46

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "Gamma"

    const v7, 0xa500

    invoke-direct {v2, v7, v13, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x47

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "DNGVersion"

    const v7, 0xc612

    const/4 v10, 0x1

    invoke-direct {v2, v7, v10, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v4, 0x48

    aput-object v2, v6, v4

    new-instance v2, Lq0/a$d;

    const-string v4, "DefaultCropSize"

    const v7, 0xc620

    invoke-direct {v2, v7, v4}, Lq0/a$d;-><init>(ILjava/lang/String;)V

    const/16 v4, 0x49

    aput-object v2, v6, v4

    const/16 v2, 0x20

    new-array v2, v2, [Lq0/a$d;

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSVersionID"

    const/4 v10, 0x0

    const/4 v15, 0x1

    invoke-direct {v4, v10, v15, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSLatitudeRef"

    invoke-direct {v4, v15, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v15

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSLatitude"

    invoke-direct {v4, v8, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v8

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSLongitudeRef"

    invoke-direct {v4, v0, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v0

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSLongitude"

    const/4 v10, 0x4

    invoke-direct {v4, v10, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSAltitudeRef"

    const/4 v10, 0x1

    invoke-direct {v4, v13, v10, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v13

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSAltitude"

    const/4 v10, 0x6

    invoke-direct {v4, v10, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSTimeStamp"

    const/4 v10, 0x7

    invoke-direct {v4, v10, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSSatellites"

    const/16 v10, 0x8

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSStatus"

    const/16 v10, 0x9

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSMeasureMode"

    const/16 v10, 0xa

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v4, Lq0/a$d;

    const/16 v7, 0xb

    const-string v10, "GPSDOP"

    invoke-direct {v4, v7, v13, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v7

    new-instance v4, Lq0/a$d;

    const/16 v7, 0xc

    const-string v10, "GPSSpeedRef"

    invoke-direct {v4, v7, v8, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v7

    new-instance v4, Lq0/a$d;

    const/16 v7, 0xd

    const-string v10, "GPSSpeed"

    invoke-direct {v4, v7, v13, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSTrackRef"

    const/16 v10, 0xe

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v4, Lq0/a$d;

    const/16 v7, 0xf

    const-string v10, "GPSTrack"

    invoke-direct {v4, v7, v13, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v7

    new-instance v4, Lq0/a$d;

    const/16 v7, 0x10

    const-string v10, "GPSImgDirectionRef"

    invoke-direct {v4, v7, v8, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v7

    new-instance v4, Lq0/a$d;

    const/16 v7, 0x11

    const-string v10, "GPSImgDirection"

    invoke-direct {v4, v7, v13, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v7

    new-instance v4, Lq0/a$d;

    const/16 v7, 0x12

    const-string v10, "GPSMapDatum"

    invoke-direct {v4, v7, v8, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v7

    new-instance v4, Lq0/a$d;

    const/16 v7, 0x13

    const-string v10, "GPSDestLatitudeRef"

    invoke-direct {v4, v7, v8, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v7

    new-instance v4, Lq0/a$d;

    const/16 v7, 0x14

    const-string v10, "GPSDestLatitude"

    invoke-direct {v4, v7, v13, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSDestLongitudeRef"

    const/16 v10, 0x15

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSDestLongitude"

    const/16 v10, 0x16

    invoke-direct {v4, v10, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v4, Lq0/a$d;

    const/16 v7, 0x17

    const-string v10, "GPSDestBearingRef"

    invoke-direct {v4, v7, v8, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v7

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSDestBearing"

    const/16 v10, 0x18

    invoke-direct {v4, v10, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSDestDistanceRef"

    const/16 v10, 0x19

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSDestDistance"

    const/16 v10, 0x1a

    invoke-direct {v4, v10, v13, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSProcessingMethod"

    const/4 v10, 0x7

    const/16 v15, 0x1b

    invoke-direct {v4, v15, v10, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v15

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSAreaInformation"

    const/16 v15, 0x1c

    invoke-direct {v4, v15, v10, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v15

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSDateStamp"

    const/16 v10, 0x1d

    invoke-direct {v4, v10, v8, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v4, Lq0/a$d;

    const-string v7, "GPSDifferential"

    const/16 v10, 0x1e

    invoke-direct {v4, v10, v0, v7}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v4, v2, v10

    new-instance v0, Lq0/a$d;

    const-string v4, "GPSHPositioningError"

    const/16 v7, 0x1f

    invoke-direct {v0, v7, v13, v4}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v0, v2, v7

    const/4 v0, 0x1

    new-array v4, v0, [Lq0/a$d;

    new-instance v7, Lq0/a$d;

    const-string v10, "InteroperabilityIndex"

    invoke-direct {v7, v0, v8, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v0, 0x0

    aput-object v7, v4, v0

    const/16 v7, 0x25

    new-array v7, v7, [Lq0/a$d;

    new-instance v8, Lq0/a$d;

    const-string v10, "NewSubfileType"

    const/16 v13, 0xfe

    const/4 v15, 0x4

    invoke-direct {v8, v13, v15, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v8, v7, v0

    new-instance v0, Lq0/a$d;

    const-string v8, "SubfileType"

    const/16 v10, 0xff

    invoke-direct {v0, v10, v15, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v8, 0x1

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "ThumbnailImageWidth"

    const/16 v10, 0x100

    invoke-direct {v0, v10, v8}, Lq0/a$d;-><init>(ILjava/lang/String;)V

    const/4 v8, 0x2

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "ThumbnailImageLength"

    const/16 v10, 0x101

    invoke-direct {v0, v10, v8}, Lq0/a$d;-><init>(ILjava/lang/String;)V

    const/4 v8, 0x3

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v10, "BitsPerSample"

    const/16 v13, 0x102

    invoke-direct {v0, v13, v8, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v10, 0x4

    aput-object v0, v7, v10

    new-instance v0, Lq0/a$d;

    const-string v10, "Compression"

    const/16 v13, 0x103

    invoke-direct {v0, v13, v8, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v10, 0x5

    aput-object v0, v7, v10

    new-instance v0, Lq0/a$d;

    const-string v10, "PhotometricInterpretation"

    const/16 v13, 0x106

    invoke-direct {v0, v13, v8, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v8, 0x6

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "ImageDescription"

    const/16 v10, 0x10e

    const/4 v13, 0x2

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v8, 0x7

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "Make"

    const/16 v10, 0x10f

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x8

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "Model"

    const/16 v10, 0x110

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x9

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "StripOffsets"

    const/16 v10, 0x111

    invoke-direct {v0, v10, v8}, Lq0/a$d;-><init>(ILjava/lang/String;)V

    const/16 v8, 0xa

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "ThumbnailOrientation"

    const/16 v10, 0x112

    const/4 v13, 0x3

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0xb

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "SamplesPerPixel"

    const/16 v10, 0x115

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0xc

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "RowsPerStrip"

    const/16 v10, 0x116

    invoke-direct {v0, v10, v8}, Lq0/a$d;-><init>(ILjava/lang/String;)V

    const/16 v8, 0xd

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "StripByteCounts"

    const/16 v10, 0x117

    invoke-direct {v0, v10, v8}, Lq0/a$d;-><init>(ILjava/lang/String;)V

    const/16 v8, 0xe

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "XResolution"

    const/16 v10, 0x11a

    const/4 v13, 0x5

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0xf

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "YResolution"

    const/16 v10, 0x11b

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x10

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "PlanarConfiguration"

    const/16 v10, 0x11c

    const/4 v13, 0x3

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x11

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "ResolutionUnit"

    const/16 v10, 0x128

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x12

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "TransferFunction"

    const/16 v10, 0x12d

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x13

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "Software"

    const/16 v10, 0x131

    const/4 v13, 0x2

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x14

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "DateTime"

    const/16 v10, 0x132

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x15

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "Artist"

    const/16 v10, 0x13b

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x16

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "WhitePoint"

    const/16 v10, 0x13e

    const/4 v13, 0x5

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x17

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "PrimaryChromaticities"

    const/16 v10, 0x13f

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x18

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "SubIFDPointer"

    const/16 v10, 0x14a

    const/4 v13, 0x4

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x19

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "JPEGInterchangeFormat"

    const/16 v10, 0x201

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x1a

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "JPEGInterchangeFormatLength"

    const/16 v10, 0x202

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x1b

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "YCbCrCoefficients"

    const/16 v10, 0x211

    const/4 v13, 0x5

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x1c

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "YCbCrSubSampling"

    const/16 v10, 0x212

    const/4 v13, 0x3

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x1d

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "YCbCrPositioning"

    const/16 v10, 0x213

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x1e

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "ReferenceBlackWhite"

    const/16 v10, 0x214

    const/4 v13, 0x5

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x1f

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "Copyright"

    const v10, 0x8298

    const/4 v13, 0x2

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x20

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "ExifIFDPointer"

    const v10, 0x8769

    const/4 v13, 0x4

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x21

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "GPSInfoIFDPointer"

    const v10, 0x8825

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x22

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "DNGVersion"

    const v10, 0xc612

    const/4 v13, 0x1

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/16 v8, 0x23

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "DefaultCropSize"

    const v10, 0xc620

    invoke-direct {v0, v10, v8}, Lq0/a$d;-><init>(ILjava/lang/String;)V

    const/16 v8, 0x24

    aput-object v0, v7, v8

    new-instance v0, Lq0/a$d;

    const-string v8, "StripOffsets"

    const/16 v10, 0x111

    const/4 v13, 0x3

    invoke-direct {v0, v10, v13, v8}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    sput-object v0, Lq0/a;->F:Lq0/a$d;

    new-array v0, v13, [Lq0/a$d;

    new-instance v8, Lq0/a$d;

    const-string v10, "ThumbnailImage"

    const/16 v13, 0x100

    const/4 v15, 0x7

    invoke-direct {v8, v13, v15, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v10, 0x0

    aput-object v8, v0, v10

    new-instance v8, Lq0/a$d;

    const-string v10, "CameraSettingsIFDPointer"

    const/16 v13, 0x2020

    const/4 v15, 0x4

    invoke-direct {v8, v13, v15, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v10, 0x1

    aput-object v8, v0, v10

    new-instance v8, Lq0/a$d;

    const-string v10, "ImageProcessingIFDPointer"

    const/16 v13, 0x2040

    invoke-direct {v8, v13, v15, v10}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v10, 0x2

    aput-object v8, v0, v10

    new-array v8, v10, [Lq0/a$d;

    new-instance v10, Lq0/a$d;

    const-string v13, "PreviewImageStart"

    move-object/from16 v16, v11

    const/16 v11, 0x101

    invoke-direct {v10, v11, v15, v13}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v11, 0x0

    aput-object v10, v8, v11

    new-instance v10, Lq0/a$d;

    const-string v11, "PreviewImageLength"

    const/16 v13, 0x102

    invoke-direct {v10, v13, v15, v11}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v11, 0x1

    aput-object v10, v8, v11

    new-array v10, v11, [Lq0/a$d;

    new-instance v11, Lq0/a$d;

    const-string v13, "AspectFrame"

    const/16 v15, 0x1113

    move-object/from16 v17, v12

    const/4 v12, 0x3

    invoke-direct {v11, v15, v12, v13}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v13, 0x0

    aput-object v11, v10, v13

    const/4 v11, 0x1

    new-array v11, v11, [Lq0/a$d;

    new-instance v13, Lq0/a$d;

    const-string v15, "ColorSpace"

    move-object/from16 v18, v1

    const/16 v1, 0x37

    invoke-direct {v13, v1, v12, v15}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v1, 0x0

    aput-object v13, v11, v1

    const/16 v13, 0xa

    new-array v13, v13, [[Lq0/a$d;

    aput-object v3, v13, v1

    const/4 v1, 0x1

    aput-object v6, v13, v1

    const/4 v1, 0x2

    aput-object v2, v13, v1

    aput-object v4, v13, v12

    const/4 v1, 0x4

    aput-object v7, v13, v1

    const/4 v2, 0x5

    aput-object v3, v13, v2

    const/4 v2, 0x6

    aput-object v0, v13, v2

    const/4 v0, 0x7

    aput-object v8, v13, v0

    const/16 v0, 0x8

    aput-object v10, v13, v0

    const/16 v0, 0x9

    aput-object v11, v13, v0

    sput-object v13, Lq0/a;->G:[[Lq0/a$d;

    new-array v0, v2, [Lq0/a$d;

    new-instance v2, Lq0/a$d;

    const-string v3, "SubIFDPointer"

    const/16 v4, 0x14a

    invoke-direct {v2, v4, v1, v3}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v3, 0x0

    aput-object v2, v0, v3

    new-instance v2, Lq0/a$d;

    const-string v3, "ExifIFDPointer"

    const v4, 0x8769

    invoke-direct {v2, v4, v1, v3}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v3, 0x1

    aput-object v2, v0, v3

    new-instance v2, Lq0/a$d;

    const-string v3, "GPSInfoIFDPointer"

    const v4, 0x8825

    invoke-direct {v2, v4, v1, v3}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v3, 0x2

    aput-object v2, v0, v3

    new-instance v2, Lq0/a$d;

    const-string v3, "InteroperabilityIFDPointer"

    const v4, 0xa005

    invoke-direct {v2, v4, v1, v3}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v3, 0x3

    aput-object v2, v0, v3

    new-instance v2, Lq0/a$d;

    const-string v3, "CameraSettingsIFDPointer"

    const/16 v4, 0x2020

    const/4 v6, 0x1

    invoke-direct {v2, v4, v6, v3}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    aput-object v2, v0, v1

    new-instance v1, Lq0/a$d;

    const-string v2, "ImageProcessingIFDPointer"

    const/16 v3, 0x2040

    invoke-direct {v1, v3, v6, v2}, Lq0/a$d;-><init>(IILjava/lang/String;)V

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sput-object v0, Lq0/a;->H:[Lq0/a$d;

    const/16 v0, 0xa

    new-array v1, v0, [Ljava/util/HashMap;

    sput-object v1, Lq0/a;->I:[Ljava/util/HashMap;

    new-array v0, v0, [Ljava/util/HashMap;

    sput-object v0, Lq0/a;->J:[Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    const-string v1, "DigitalZoomRatio"

    const-string v2, "ExposureTime"

    const-string v3, "FNumber"

    const-string v4, "SubjectDistance"

    const-string v6, "GPSTimeStamp"

    filled-new-array {v3, v1, v2, v4, v6}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lq0/a;->K:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lq0/a;->L:Ljava/util/HashMap;

    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lq0/a;->M:Ljava/nio/charset/Charset;

    const-string v1, "Exif\u0000\u0000"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    sput-object v1, Lq0/a;->N:[B

    const-string v1, "http://ns.adobe.com/xap/1.0/\u0000"

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Lq0/a;->O:[B

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy:MM:dd HH:mm:ss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    const-string v1, "UTC"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lq0/a;->G:[[Lq0/a$d;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    sget-object v2, Lq0/a;->I:[Ljava/util/HashMap;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    aput-object v3, v2, v0

    sget-object v2, Lq0/a;->J:[Ljava/util/HashMap;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    aput-object v3, v2, v0

    aget-object v1, v1, v0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    sget-object v6, Lq0/a;->I:[Ljava/util/HashMap;

    aget-object v6, v6, v0

    iget v7, v4, Lq0/a$d;->a:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lq0/a;->J:[Ljava/util/HashMap;

    aget-object v6, v6, v0

    iget-object v7, v4, Lq0/a$d;->b:Ljava/lang/String;

    invoke-virtual {v6, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    sget-object v0, Lq0/a;->L:Ljava/util/HashMap;

    sget-object v1, Lq0/a;->H:[Lq0/a$d;

    const/4 v2, 0x0

    aget-object v2, v1, v2

    iget v2, v2, Lq0/a$d;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    aget-object v2, v1, v2

    iget v2, v2, Lq0/a$d;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x2

    aget-object v2, v1, v2

    iget v2, v2, Lq0/a$d;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x3

    aget-object v2, v1, v2

    iget v2, v2, Lq0/a$d;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v18

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x4

    aget-object v2, v1, v2

    iget v2, v2, Lq0/a$d;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v17

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    iget v1, v1, Lq0/a$d;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v16

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, ".*[1-9].*"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    const-string v0, "^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    return-void

    :array_0
    .array-data 4
        0x8
        0x8
        0x8
    .end array-data

    :array_1
    .array-data 1
        -0x1t
        -0x28t
        -0x1t
    .end array-data

    :array_2
    .array-data 1
        0x66t
        0x74t
        0x79t
        0x70t
    .end array-data

    :array_3
    .array-data 1
        0x6dt
        0x69t
        0x66t
        0x31t
    .end array-data

    :array_4
    .array-data 1
        0x68t
        0x65t
        0x69t
        0x63t
    .end array-data

    :array_5
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x0t
    .end array-data

    nop

    :array_6
    .array-data 1
        0x4ft
        0x4ct
        0x59t
        0x4dt
        0x50t
        0x55t
        0x53t
        0x0t
        0x49t
        0x49t
    .end array-data

    nop

    :array_7
    .array-data 1
        -0x77t
        0x50t
        0x4et
        0x47t
        0xdt
        0xat
        0x1at
        0xat
    .end array-data

    :array_8
    .array-data 1
        0x65t
        0x58t
        0x49t
        0x66t
    .end array-data

    :array_9
    .array-data 1
        0x49t
        0x48t
        0x44t
        0x52t
    .end array-data

    :array_a
    .array-data 1
        0x49t
        0x45t
        0x4et
        0x44t
    .end array-data

    :array_b
    .array-data 1
        0x52t
        0x49t
        0x46t
        0x46t
    .end array-data

    :array_c
    .array-data 1
        0x57t
        0x45t
        0x42t
        0x50t
    .end array-data

    :array_d
    .array-data 1
        0x45t
        0x58t
        0x49t
        0x46t
    .end array-data

    :array_e
    .array-data 4
        0x0
        0x1
        0x1
        0x2
        0x4
        0x8
        0x1
        0x1
        0x2
        0x4
        0x8
        0x4
        0x8
        0x1
    .end array-data

    :array_f
    .array-data 1
        0x41t
        0x53t
        0x43t
        0x49t
        0x49t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lq0/a;->G:[[Lq0/a$d;

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    new-array v1, v1, [Ljava/util/HashMap;

    .line 8
    .line 9
    iput-object v1, p0, Lq0/a;->d:[Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v1, Ljava/util/HashSet;

    .line 12
    .line 13
    array-length v2, v0

    .line 14
    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lq0/a;->e:Ljava/util/HashSet;

    .line 18
    .line 19
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 20
    .line 21
    iput-object v1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    if-eqz p1, :cond_7

    .line 24
    .line 25
    instance-of v1, p1, Landroid/content/res/AssetManager$AssetInputStream;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    sget-boolean v3, Lq0/a;->m:Z

    .line 29
    .line 30
    const-string v4, "ExifInterface"

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    move-object v1, p1

    .line 36
    check-cast v1, Landroid/content/res/AssetManager$AssetInputStream;

    .line 37
    .line 38
    iput-object v1, p0, Lq0/a;->b:Landroid/content/res/AssetManager$AssetInputStream;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    instance-of v1, p1, Ljava/io/FileInputStream;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    move-object v1, p1

    .line 46
    check-cast v1, Ljava/io/FileInputStream;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    :try_start_0
    sget v7, Landroid/system/OsConstants;->SEEK_CUR:I

    .line 53
    .line 54
    const-wide/16 v8, 0x0

    .line 55
    .line 56
    invoke-static {v6, v8, v9, v7}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    const/4 v6, 0x1

    .line 60
    goto :goto_0

    .line 61
    :catch_0
    if-eqz v3, :cond_1

    .line 62
    .line 63
    const-string v6, "The file descriptor for the given input is not seekable"

    .line 64
    .line 65
    invoke-static {v4, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    :cond_1
    move v6, v5

    .line 69
    :goto_0
    if-eqz v6, :cond_2

    .line 70
    .line 71
    iput-object v2, p0, Lq0/a;->b:Landroid/content/res/AssetManager$AssetInputStream;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    iput-object v2, p0, Lq0/a;->b:Landroid/content/res/AssetManager$AssetInputStream;

    .line 79
    .line 80
    :goto_1
    iput-object v2, p0, Lq0/a;->a:Ljava/io/FileDescriptor;

    .line 81
    .line 82
    move v1, v5

    .line 83
    :goto_2
    :try_start_1
    array-length v2, v0

    .line 84
    if-ge v1, v2, :cond_3

    .line 85
    .line 86
    iget-object v2, p0, Lq0/a;->d:[Ljava/util/HashMap;

    .line 87
    .line 88
    new-instance v6, Ljava/util/HashMap;

    .line 89
    .line 90
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 91
    .line 92
    .line 93
    aput-object v6, v2, v1

    .line 94
    .line 95
    add-int/lit8 v1, v1, 0x1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    new-instance v0, Ljava/io/BufferedInputStream;

    .line 99
    .line 100
    const/16 v1, 0x1388

    .line 101
    .line 102
    invoke-direct {v0, p1, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, v0}, Lq0/a;->h(Ljava/io/BufferedInputStream;)I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    iput p1, p0, Lq0/a;->c:I

    .line 110
    .line 111
    new-instance p1, Lq0/a$b;

    .line 112
    .line 113
    invoke-direct {p1, v0}, Lq0/a$b;-><init>(Ljava/io/InputStream;)V

    .line 114
    .line 115
    .line 116
    iget v0, p0, Lq0/a;->c:I

    .line 117
    .line 118
    packed-switch v0, :pswitch_data_0

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :pswitch_0
    invoke-virtual {p0, p1}, Lq0/a;->n(Lq0/a$b;)V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :pswitch_1
    invoke-virtual {p0, p1}, Lq0/a;->j(Lq0/a$b;)V

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :pswitch_2
    invoke-virtual {p0, p1}, Lq0/a;->f(Lq0/a$b;)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :pswitch_3
    invoke-virtual {p0, p1}, Lq0/a;->m(Lq0/a$b;)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :pswitch_4
    invoke-virtual {p0, p1}, Lq0/a;->k(Lq0/a$b;)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :pswitch_5
    invoke-virtual {p0, p1}, Lq0/a;->i(Lq0/a$b;)V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :pswitch_6
    invoke-virtual {p0, p1, v5, v5}, Lq0/a;->g(Lq0/a$b;II)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :pswitch_7
    invoke-virtual {p0, p1}, Lq0/a;->l(Lq0/a$b;)V

    .line 151
    .line 152
    .line 153
    :goto_3
    invoke-virtual {p0, p1}, Lq0/a;->v(Lq0/a$b;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0}, Lq0/a;->a()V

    .line 157
    .line 158
    .line 159
    if-eqz v3, :cond_6

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :catchall_0
    move-exception p1

    .line 163
    goto :goto_4

    .line 164
    :catch_1
    move-exception p1

    .line 165
    if-eqz v3, :cond_5

    .line 166
    .line 167
    :try_start_2
    const-string v0, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."

    .line 168
    .line 169
    invoke-static {v4, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    .line 171
    .line 172
    goto :goto_5

    .line 173
    :goto_4
    invoke-virtual {p0}, Lq0/a;->a()V

    .line 174
    .line 175
    .line 176
    if-eqz v3, :cond_4

    .line 177
    .line 178
    invoke-virtual {p0}, Lq0/a;->r()V

    .line 179
    .line 180
    .line 181
    :cond_4
    throw p1

    .line 182
    :cond_5
    :goto_5
    invoke-virtual {p0}, Lq0/a;->a()V

    .line 183
    .line 184
    .line 185
    if-eqz v3, :cond_6

    .line 186
    .line 187
    :goto_6
    invoke-virtual {p0}, Lq0/a;->r()V

    .line 188
    .line 189
    .line 190
    :cond_6
    return-void

    .line 191
    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    .line 192
    .line 193
    const-string v0, "inputStream cannot be null"

    .line 194
    .line 195
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw p1

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_7
        :pswitch_5
        :pswitch_7
        :pswitch_4
        :pswitch_3
        :pswitch_7
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
.end method

.method public static b([B)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    array-length v1, p0

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aget-byte v4, p0, v2

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    aput-object v4, v3, v1

    const-string v4, "%02x"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/io/Serializable;)[J
    .locals 4

    instance-of v0, p0, [I

    if-eqz v0, :cond_1

    check-cast p0, [I

    array-length v0, p0

    new-array v0, v0, [J

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget v2, p0, v1

    int-to-long v2, v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    instance-of v0, p0, [J

    if-eqz v0, :cond_2

    check-cast p0, [J

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static s(Lq0/a$b;)Ljava/nio/ByteOrder;
    .locals 3

    invoke-virtual {p0}, Lq0/a$b;->readShort()S

    move-result p0

    const/16 v0, 0x4949

    const-string v1, "ExifInterface"

    sget-boolean v2, Lq0/a;->m:Z

    if-eq p0, v0, :cond_2

    const/16 v0, 0x4d4d

    if-ne p0, v0, :cond_1

    if-eqz v2, :cond_0

    const-string p0, "readExifSegment: Byte Align MM"

    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    sget-object p0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    return-object p0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid byte order: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    if-eqz v2, :cond_3

    const-string p0, "readExifSegment: Byte Align II"

    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    sget-object p0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 7

    const-string v0, "DateTimeOriginal"

    invoke-virtual {p0, v0}, Lq0/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    iget-object v2, p0, Lq0/a;->d:[Ljava/util/HashMap;

    if-eqz v0, :cond_0

    const-string v3, "DateTime"

    invoke-virtual {p0, v3}, Lq0/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    aget-object v4, v2, v1

    invoke-static {v0}, Lq0/a$c;->a(Ljava/lang/String;)Lq0/a$c;

    move-result-object v0

    invoke-virtual {v4, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v0, "ImageWidth"

    invoke-virtual {p0, v0}, Lq0/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-wide/16 v4, 0x0

    if-nez v3, :cond_1

    aget-object v3, v2, v1

    iget-object v6, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    invoke-static {v4, v5, v6}, Lq0/a$c;->b(JLjava/nio/ByteOrder;)Lq0/a$c;

    move-result-object v6

    invoke-virtual {v3, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string v0, "ImageLength"

    invoke-virtual {p0, v0}, Lq0/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    aget-object v3, v2, v1

    iget-object v6, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    invoke-static {v4, v5, v6}, Lq0/a$c;->b(JLjava/nio/ByteOrder;)Lq0/a$c;

    move-result-object v6

    invoke-virtual {v3, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-string v0, "Orientation"

    invoke-virtual {p0, v0}, Lq0/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    aget-object v1, v2, v1

    iget-object v3, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    invoke-static {v4, v5, v3}, Lq0/a$c;->b(JLjava/nio/ByteOrder;)Lq0/a$c;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const-string v0, "LightSource"

    invoke-virtual {p0, v0}, Lq0/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    const/4 v1, 0x1

    aget-object v1, v2, v1

    iget-object v2, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    invoke-static {v4, v5, v2}, Lq0/a$c;->b(JLjava/nio/ByteOrder;)Lq0/a$c;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-void
.end method

.method public final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lq0/a;->e(Ljava/lang/String;)Lq0/a$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    sget-object v2, Lq0/a;->K:Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-virtual {v2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lq0/a$c;->g(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    const-string v2, "GPSTimeStamp"

    .line 24
    .line 25
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_4

    .line 30
    .line 31
    const/4 p1, 0x5

    .line 32
    iget v2, v0, Lq0/a$c;->a:I

    .line 33
    .line 34
    if-eq v2, p1, :cond_1

    .line 35
    .line 36
    const/16 p1, 0xa

    .line 37
    .line 38
    if-eq v2, p1, :cond_1

    .line 39
    .line 40
    const-string p1, "GPS Timestamp format is not rational. format="

    .line 41
    .line 42
    invoke-static {p1, v2}, Landroidx/activity/j;->a(Ljava/lang/String;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    iget-object p1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lq0/a$c;->h(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, [Lq0/a$e;

    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    array-length v0, p1

    .line 58
    const/4 v2, 0x3

    .line 59
    if-eq v0, v2, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    new-array v0, v2, [Ljava/lang/Object;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    aget-object v2, p1, v1

    .line 66
    .line 67
    iget-wide v3, v2, Lq0/a$e;->a:J

    .line 68
    .line 69
    long-to-float v3, v3

    .line 70
    iget-wide v4, v2, Lq0/a$e;->b:J

    .line 71
    .line 72
    long-to-float v2, v4

    .line 73
    div-float/2addr v3, v2

    .line 74
    float-to-int v2, v3

    .line 75
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    aput-object v2, v0, v1

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    aget-object v2, p1, v1

    .line 83
    .line 84
    iget-wide v3, v2, Lq0/a$e;->a:J

    .line 85
    .line 86
    long-to-float v3, v3

    .line 87
    iget-wide v4, v2, Lq0/a$e;->b:J

    .line 88
    .line 89
    long-to-float v2, v4

    .line 90
    div-float/2addr v3, v2

    .line 91
    float-to-int v2, v3

    .line 92
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    aput-object v2, v0, v1

    .line 97
    .line 98
    const/4 v1, 0x2

    .line 99
    aget-object p1, p1, v1

    .line 100
    .line 101
    iget-wide v2, p1, Lq0/a$e;->a:J

    .line 102
    .line 103
    long-to-float v2, v2

    .line 104
    iget-wide v3, p1, Lq0/a$e;->b:J

    .line 105
    .line 106
    long-to-float p1, v3

    .line 107
    div-float/2addr v2, p1

    .line 108
    float-to-int p1, v2

    .line 109
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    aput-object p1, v0, v1

    .line 114
    .line 115
    const-string p1, "%02d:%02d:%02d"

    .line 116
    .line 117
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string v2, "Invalid GPS Timestamp array. array="

    .line 125
    .line 126
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    :goto_1
    const-string v0, "ExifInterface"

    .line 141
    .line 142
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    return-object v1

    .line 146
    :cond_4
    :try_start_0
    iget-object p1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 147
    .line 148
    invoke-virtual {v0, p1}, Lq0/a$c;->e(Ljava/nio/ByteOrder;)D

    .line 149
    .line 150
    .line 151
    move-result-wide v2

    .line 152
    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    return-object p1

    .line 157
    :catch_0
    :cond_5
    return-object v1
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
.end method

.method public final e(Ljava/lang/String;)Lq0/a$c;
    .locals 2

    const-string v0, "ISOSpeedRatings"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-boolean p1, Lq0/a;->m:Z

    if-eqz p1, :cond_0

    const-string p1, "ExifInterface"

    const-string v0, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const-string p1, "PhotographicSensitivity"

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lq0/a;->G:[[Lq0/a$d;

    array-length v1, v1

    if-ge v0, v1, :cond_3

    iget-object v1, p0, Lq0/a;->d:[Ljava/util/HashMap;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq0/a$c;

    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final f(Lq0/a$b;)V
    .locals 13

    const-string v0, "yes"

    const-string v1, "Heif meta: "

    new-instance v2, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    :try_start_0
    new-instance v3, Lq0/a$a;

    invoke-direct {v3, p1}, Lq0/a$a;-><init>(Lq0/a$b;)V

    invoke-virtual {v2, v3}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    const/16 v3, 0x21

    invoke-virtual {v2, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x22

    invoke-virtual {v2, v4}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x1a

    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x11

    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/16 v0, 0x1d

    invoke-virtual {v2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    const/16 v5, 0x1e

    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x1f

    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x12

    invoke-virtual {v2, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    const/16 v5, 0x13

    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x18

    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    move-object v5, v0

    move-object v6, v5

    :goto_0
    iget-object v7, p0, Lq0/a;->d:[Ljava/util/HashMap;

    const/4 v8, 0x0

    if-eqz v0, :cond_2

    :try_start_1
    aget-object v9, v7, v8

    const-string v10, "ImageWidth"

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    iget-object v12, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    invoke-static {v11, v12}, Lq0/a$c;->d(ILjava/nio/ByteOrder;)Lq0/a$c;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz v5, :cond_3

    aget-object v9, v7, v8

    const-string v10, "ImageLength"

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v11

    iget-object v12, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    invoke-static {v11, v12}, Lq0/a$c;->d(ILjava/nio/ByteOrder;)Lq0/a$c;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/4 v9, 0x6

    if-eqz v6, :cond_7

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    const/16 v11, 0x5a

    if-eq v10, v11, :cond_6

    const/16 v11, 0xb4

    if-eq v10, v11, :cond_5

    const/16 v11, 0x10e

    if-eq v10, v11, :cond_4

    const/4 v10, 0x1

    goto :goto_1

    :cond_4
    const/16 v10, 0x8

    goto :goto_1

    :cond_5
    const/4 v10, 0x3

    goto :goto_1

    :cond_6
    move v10, v9

    :goto_1
    aget-object v7, v7, v8

    const-string v11, "Orientation"

    iget-object v12, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    invoke-static {v10, v12}, Lq0/a$c;->d(ILjava/nio/ByteOrder;)Lq0/a$c;

    move-result-object v10

    invoke-virtual {v7, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    if-eqz v3, :cond_c

    if-eqz v4, :cond_c

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    if-le v4, v9, :cond_b

    int-to-long v10, v3

    invoke-virtual {p1, v10, v11}, Lq0/a$b;->c(J)V

    new-array v7, v9, [B

    invoke-virtual {p1, v7}, Ljava/io/InputStream;->read([B)I

    move-result v10

    if-ne v10, v9, :cond_a

    add-int/2addr v3, v9

    add-int/lit8 v4, v4, -0x6

    sget-object v9, Lq0/a;->N:[B

    invoke-static {v7, v9}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v7

    if-eqz v7, :cond_9

    new-array v7, v4, [B

    invoke-virtual {p1, v7}, Ljava/io/InputStream;->read([B)I

    move-result p1

    if-ne p1, v4, :cond_8

    iput v3, p0, Lq0/a;->h:I

    invoke-virtual {p0, v7, v8}, Lq0/a;->t([BI)V

    goto :goto_2

    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Can\'t read exif"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid identifier"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Can\'t read identifier"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid exif length"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    :goto_2
    sget-boolean p1, Lq0/a;->m:Z

    if-eqz p1, :cond_d

    const-string p1, "ExifInterface"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "x"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", rotation "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_d
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    throw p1
.end method

.method public final g(Lq0/a$b;II)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    const-string v4, "ExifInterface"

    .line 10
    .line 11
    sget-boolean v5, Lq0/a;->m:Z

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    new-instance v6, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v7, "getJpegAttributes starting with: "

    .line 18
    .line 19
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-static {v4, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_0
    sget-object v6, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 33
    .line 34
    iput-object v6, v1, Lq0/a$b;->c:Ljava/nio/ByteOrder;

    .line 35
    .line 36
    int-to-long v6, v2

    .line 37
    invoke-virtual {v1, v6, v7}, Lq0/a$b;->c(J)V

    .line 38
    .line 39
    .line 40
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readByte()B

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    const/4 v7, -0x1

    .line 45
    const-string v8, "Invalid marker: "

    .line 46
    .line 47
    if-ne v6, v7, :cond_19

    .line 48
    .line 49
    const/4 v9, 0x1

    .line 50
    add-int/2addr v2, v9

    .line 51
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readByte()B

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    const/16 v11, -0x28

    .line 56
    .line 57
    if-ne v10, v11, :cond_18

    .line 58
    .line 59
    add-int/2addr v2, v9

    .line 60
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readByte()B

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-ne v6, v7, :cond_17

    .line 65
    .line 66
    add-int/2addr v2, v9

    .line 67
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readByte()B

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-eqz v5, :cond_1

    .line 72
    .line 73
    new-instance v8, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v10, "Found JPEG segment indicator: "

    .line 76
    .line 77
    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    and-int/lit16 v10, v6, 0xff

    .line 81
    .line 82
    invoke-static {v10}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-static {v4, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    .line 95
    .line 96
    :cond_1
    add-int/2addr v2, v9

    .line 97
    const/16 v8, -0x27

    .line 98
    .line 99
    if-eq v6, v8, :cond_16

    .line 100
    .line 101
    const/16 v8, -0x26

    .line 102
    .line 103
    if-ne v6, v8, :cond_2

    .line 104
    .line 105
    goto/16 :goto_c

    .line 106
    .line 107
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readUnsignedShort()I

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    const/4 v10, -0x2

    .line 112
    add-int/2addr v8, v10

    .line 113
    add-int/lit8 v2, v2, 0x2

    .line 114
    .line 115
    if-eqz v5, :cond_3

    .line 116
    .line 117
    new-instance v11, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v12, "JPEG segment: "

    .line 120
    .line 121
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    and-int/lit16 v12, v6, 0xff

    .line 125
    .line 126
    invoke-static {v12}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v12, " (length: "

    .line 134
    .line 135
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    add-int/lit8 v12, v8, 0x2

    .line 139
    .line 140
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v12, ")"

    .line 144
    .line 145
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    invoke-static {v4, v11}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    :cond_3
    const-string v11, "Invalid length"

    .line 156
    .line 157
    if-ltz v8, :cond_15

    .line 158
    .line 159
    const/4 v12, 0x0

    .line 160
    const/16 v13, -0x1f

    .line 161
    .line 162
    iget-object v14, v0, Lq0/a;->d:[Ljava/util/HashMap;

    .line 163
    .line 164
    if-eq v6, v13, :cond_8

    .line 165
    .line 166
    if-eq v6, v10, :cond_5

    .line 167
    .line 168
    packed-switch v6, :pswitch_data_0

    .line 169
    .line 170
    .line 171
    packed-switch v6, :pswitch_data_1

    .line 172
    .line 173
    .line 174
    packed-switch v6, :pswitch_data_2

    .line 175
    .line 176
    .line 177
    packed-switch v6, :pswitch_data_3

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :pswitch_0
    invoke-virtual {v1, v9}, Lq0/a$b;->skipBytes(I)I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    if-ne v6, v9, :cond_4

    .line 186
    .line 187
    aget-object v6, v14, v3

    .line 188
    .line 189
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readUnsignedShort()I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    int-to-long v12, v10

    .line 194
    iget-object v10, v0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 195
    .line 196
    invoke-static {v12, v13, v10}, Lq0/a$c;->b(JLjava/nio/ByteOrder;)Lq0/a$c;

    .line 197
    .line 198
    .line 199
    move-result-object v10

    .line 200
    const-string v12, "ImageLength"

    .line 201
    .line 202
    invoke-virtual {v6, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    aget-object v6, v14, v3

    .line 206
    .line 207
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readUnsignedShort()I

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    int-to-long v12, v10

    .line 212
    iget-object v10, v0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 213
    .line 214
    invoke-static {v12, v13, v10}, Lq0/a$c;->b(JLjava/nio/ByteOrder;)Lq0/a$c;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    const-string v12, "ImageWidth"

    .line 219
    .line 220
    invoke-virtual {v6, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    add-int/lit8 v8, v8, -0x5

    .line 224
    .line 225
    :goto_1
    move v13, v9

    .line 226
    goto/16 :goto_b

    .line 227
    .line 228
    :cond_4
    new-instance v1, Ljava/io/IOException;

    .line 229
    .line 230
    const-string v2, "Invalid SOFx"

    .line 231
    .line 232
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v1

    .line 236
    :cond_5
    new-array v6, v8, [B

    .line 237
    .line 238
    invoke-virtual {v1, v6}, Ljava/io/InputStream;->read([B)I

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    if-ne v10, v8, :cond_7

    .line 243
    .line 244
    const-string v8, "UserComment"

    .line 245
    .line 246
    invoke-virtual {v0, v8}, Lq0/a;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v10

    .line 250
    if-nez v10, :cond_6

    .line 251
    .line 252
    aget-object v10, v14, v9

    .line 253
    .line 254
    new-instance v13, Ljava/lang/String;

    .line 255
    .line 256
    sget-object v14, Lq0/a;->M:Ljava/nio/charset/Charset;

    .line 257
    .line 258
    invoke-direct {v13, v6, v14}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 259
    .line 260
    .line 261
    invoke-static {v13}, Lq0/a$c;->a(Ljava/lang/String;)Lq0/a$c;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    invoke-virtual {v10, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    :cond_6
    move v13, v9

    .line 269
    goto/16 :goto_a

    .line 270
    .line 271
    :cond_7
    new-instance v1, Ljava/io/IOException;

    .line 272
    .line 273
    const-string v2, "Invalid exif"

    .line 274
    .line 275
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw v1

    .line 279
    :cond_8
    new-array v6, v8, [B

    .line 280
    .line 281
    invoke-virtual {v1, v6}, Lq0/a$b;->readFully([B)V

    .line 282
    .line 283
    .line 284
    add-int v10, v2, v8

    .line 285
    .line 286
    sget-object v13, Lq0/a;->N:[B

    .line 287
    .line 288
    if-nez v13, :cond_9

    .line 289
    .line 290
    :goto_2
    move v7, v12

    .line 291
    goto :goto_4

    .line 292
    :cond_9
    array-length v15, v13

    .line 293
    if-ge v8, v15, :cond_a

    .line 294
    .line 295
    goto :goto_2

    .line 296
    :cond_a
    move v15, v12

    .line 297
    :goto_3
    array-length v7, v13

    .line 298
    if-ge v15, v7, :cond_c

    .line 299
    .line 300
    aget-byte v7, v6, v15

    .line 301
    .line 302
    aget-byte v9, v13, v15

    .line 303
    .line 304
    if-eq v7, v9, :cond_b

    .line 305
    .line 306
    goto :goto_2

    .line 307
    :cond_b
    add-int/lit8 v15, v15, 0x1

    .line 308
    .line 309
    const/4 v9, 0x1

    .line 310
    goto :goto_3

    .line 311
    :cond_c
    const/4 v7, 0x1

    .line 312
    :goto_4
    if-eqz v7, :cond_d

    .line 313
    .line 314
    array-length v7, v13

    .line 315
    add-int/2addr v2, v7

    .line 316
    array-length v7, v13

    .line 317
    invoke-static {v6, v7, v8}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    iput v2, v0, Lq0/a;->h:I

    .line 322
    .line 323
    invoke-virtual {v0, v6, v3}, Lq0/a;->t([BI)V

    .line 324
    .line 325
    .line 326
    goto :goto_8

    .line 327
    :cond_d
    sget-object v2, Lq0/a;->O:[B

    .line 328
    .line 329
    if-nez v2, :cond_e

    .line 330
    .line 331
    :goto_5
    move v7, v12

    .line 332
    goto :goto_7

    .line 333
    :cond_e
    array-length v7, v2

    .line 334
    if-ge v8, v7, :cond_f

    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_f
    move v7, v12

    .line 338
    :goto_6
    array-length v9, v2

    .line 339
    if-ge v7, v9, :cond_11

    .line 340
    .line 341
    aget-byte v9, v6, v7

    .line 342
    .line 343
    aget-byte v13, v2, v7

    .line 344
    .line 345
    if-eq v9, v13, :cond_10

    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_10
    add-int/lit8 v7, v7, 0x1

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_11
    const/4 v7, 0x1

    .line 352
    :goto_7
    if-eqz v7, :cond_12

    .line 353
    .line 354
    array-length v7, v2

    .line 355
    array-length v2, v2

    .line 356
    invoke-static {v6, v2, v8}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    const-string v6, "Xmp"

    .line 361
    .line 362
    invoke-virtual {v0, v6}, Lq0/a;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v7

    .line 366
    if-nez v7, :cond_12

    .line 367
    .line 368
    aget-object v7, v14, v12

    .line 369
    .line 370
    new-instance v8, Lq0/a$c;

    .line 371
    .line 372
    array-length v9, v2

    .line 373
    const/4 v13, 0x1

    .line 374
    invoke-direct {v8, v2, v13, v9, v12}, Lq0/a$c;-><init>([BIII)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v7, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_12
    :goto_8
    const/4 v13, 0x1

    .line 382
    :goto_9
    move v2, v10

    .line 383
    :goto_a
    move v8, v12

    .line 384
    :goto_b
    if-ltz v8, :cond_14

    .line 385
    .line 386
    invoke-virtual {v1, v8}, Lq0/a$b;->skipBytes(I)I

    .line 387
    .line 388
    .line 389
    move-result v6

    .line 390
    if-ne v6, v8, :cond_13

    .line 391
    .line 392
    add-int/2addr v2, v8

    .line 393
    move v9, v13

    .line 394
    const/4 v7, -0x1

    .line 395
    goto/16 :goto_0

    .line 396
    .line 397
    :cond_13
    new-instance v1, Ljava/io/IOException;

    .line 398
    .line 399
    const-string v2, "Invalid JPEG segment"

    .line 400
    .line 401
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    throw v1

    .line 405
    :cond_14
    new-instance v1, Ljava/io/IOException;

    .line 406
    .line 407
    invoke-direct {v1, v11}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw v1

    .line 411
    :cond_15
    new-instance v1, Ljava/io/IOException;

    .line 412
    .line 413
    invoke-direct {v1, v11}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    throw v1

    .line 417
    :cond_16
    :goto_c
    iget-object v2, v0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 418
    .line 419
    iput-object v2, v1, Lq0/a$b;->c:Ljava/nio/ByteOrder;

    .line 420
    .line 421
    return-void

    .line 422
    :cond_17
    new-instance v1, Ljava/io/IOException;

    .line 423
    .line 424
    new-instance v2, Ljava/lang/StringBuilder;

    .line 425
    .line 426
    const-string v3, "Invalid marker:"

    .line 427
    .line 428
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    and-int/lit16 v3, v6, 0xff

    .line 432
    .line 433
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    throw v1

    .line 448
    :cond_18
    new-instance v1, Ljava/io/IOException;

    .line 449
    .line 450
    new-instance v2, Ljava/lang/StringBuilder;

    .line 451
    .line 452
    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    and-int/lit16 v3, v6, 0xff

    .line 456
    .line 457
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    throw v1

    .line 472
    :cond_19
    new-instance v1, Ljava/io/IOException;

    .line 473
    .line 474
    new-instance v2, Ljava/lang/StringBuilder;

    .line 475
    .line 476
    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    and-int/lit16 v3, v6, 0xff

    .line 480
    .line 481
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v3

    .line 485
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v2

    .line 492
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    throw v1

    .line 496
    nop

    .line 497
    :pswitch_data_0
    .packed-switch -0x40
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    :pswitch_data_1
    .packed-switch -0x3b
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    :pswitch_data_2
    .packed-switch -0x37
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    :pswitch_data_3
    .packed-switch -0x33
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
.end method

.method public final h(Ljava/io/BufferedInputStream;)I
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/16 v2, 0x1388

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Ljava/io/BufferedInputStream;->mark(I)V

    .line 8
    .line 9
    .line 10
    new-array v3, v2, [B

    .line 11
    .line 12
    invoke-virtual {v0, v3}, Ljava/io/InputStream;->read([B)I

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p1 .. p1}, Ljava/io/BufferedInputStream;->reset()V

    .line 16
    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    move v0, v4

    .line 20
    :goto_0
    sget-object v5, Lq0/a;->p:[B

    .line 21
    .line 22
    array-length v6, v5

    .line 23
    if-ge v0, v6, :cond_1

    .line 24
    .line 25
    aget-byte v6, v3, v0

    .line 26
    .line 27
    aget-byte v5, v5, v0

    .line 28
    .line 29
    if-eq v6, v5, :cond_0

    .line 30
    .line 31
    move v0, v4

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v0, 0x1

    .line 37
    :goto_1
    const/4 v5, 0x4

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    return v5

    .line 41
    :cond_2
    const-string v0, "FUJIFILMCCD-RAW"

    .line 42
    .line 43
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v0, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move v6, v4

    .line 52
    :goto_2
    array-length v8, v0

    .line 53
    if-ge v6, v8, :cond_4

    .line 54
    .line 55
    aget-byte v8, v3, v6

    .line 56
    .line 57
    aget-byte v9, v0, v6

    .line 58
    .line 59
    if-eq v8, v9, :cond_3

    .line 60
    .line 61
    move v0, v4

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    const/4 v0, 0x1

    .line 67
    :goto_3
    if-eqz v0, :cond_5

    .line 68
    .line 69
    const/16 v0, 0x9

    .line 70
    .line 71
    return v0

    .line 72
    :cond_5
    :try_start_0
    new-instance v8, Lq0/a$b;

    .line 73
    .line 74
    invoke-direct {v8, v3}, Lq0/a$b;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 75
    .line 76
    .line 77
    :try_start_1
    invoke-virtual {v8}, Lq0/a$b;->readInt()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    int-to-long v9, v0

    .line 82
    new-array v0, v5, [B

    .line 83
    .line 84
    invoke-virtual {v8, v0}, Ljava/io/InputStream;->read([B)I

    .line 85
    .line 86
    .line 87
    sget-object v11, Lq0/a;->q:[B

    .line 88
    .line 89
    invoke-static {v0, v11}, Ljava/util/Arrays;->equals([B[B)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_6

    .line 94
    .line 95
    goto/16 :goto_8

    .line 96
    .line 97
    :cond_6
    const-wide/16 v11, 0x1

    .line 98
    .line 99
    cmp-long v0, v9, v11

    .line 100
    .line 101
    const-wide/16 v13, 0x8

    .line 102
    .line 103
    if-nez v0, :cond_7

    .line 104
    .line 105
    invoke-virtual {v8}, Lq0/a$b;->readLong()J

    .line 106
    .line 107
    .line 108
    move-result-wide v9

    .line 109
    const-wide/16 v15, 0x10

    .line 110
    .line 111
    cmp-long v0, v9, v15

    .line 112
    .line 113
    if-gez v0, :cond_8

    .line 114
    .line 115
    goto/16 :goto_8

    .line 116
    .line 117
    :cond_7
    move-wide v15, v13

    .line 118
    :cond_8
    int-to-long v6, v2

    .line 119
    cmp-long v0, v9, v6

    .line 120
    .line 121
    if-lez v0, :cond_9

    .line 122
    .line 123
    move-wide v9, v6

    .line 124
    :cond_9
    sub-long/2addr v9, v15

    .line 125
    cmp-long v0, v9, v13

    .line 126
    .line 127
    if-gez v0, :cond_a

    .line 128
    .line 129
    goto :goto_8

    .line 130
    :cond_a
    new-array v0, v5, [B

    .line 131
    .line 132
    const-wide/16 v6, 0x0

    .line 133
    .line 134
    move v2, v4

    .line 135
    move v13, v2

    .line 136
    :goto_4
    const-wide/16 v14, 0x4

    .line 137
    .line 138
    div-long v14, v9, v14

    .line 139
    .line 140
    cmp-long v14, v6, v14

    .line 141
    .line 142
    if-gez v14, :cond_11

    .line 143
    .line 144
    invoke-virtual {v8, v0}, Ljava/io/InputStream;->read([B)I

    .line 145
    .line 146
    .line 147
    move-result v14

    .line 148
    if-eq v14, v5, :cond_b

    .line 149
    .line 150
    goto :goto_8

    .line 151
    :cond_b
    cmp-long v14, v6, v11

    .line 152
    .line 153
    if-nez v14, :cond_c

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_c
    sget-object v14, Lq0/a;->r:[B

    .line 157
    .line 158
    invoke-static {v0, v14}, Ljava/util/Arrays;->equals([B[B)Z

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    if-eqz v14, :cond_d

    .line 163
    .line 164
    const/4 v2, 0x1

    .line 165
    goto :goto_5

    .line 166
    :cond_d
    sget-object v14, Lq0/a;->s:[B

    .line 167
    .line 168
    invoke-static {v0, v14}, Ljava/util/Arrays;->equals([B[B)Z

    .line 169
    .line 170
    .line 171
    move-result v14
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    if-eqz v14, :cond_e

    .line 173
    .line 174
    const/4 v13, 0x1

    .line 175
    :cond_e
    :goto_5
    if-eqz v2, :cond_f

    .line 176
    .line 177
    if-eqz v13, :cond_f

    .line 178
    .line 179
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 180
    .line 181
    .line 182
    const/4 v0, 0x1

    .line 183
    goto :goto_9

    .line 184
    :cond_f
    :goto_6
    add-long/2addr v6, v11

    .line 185
    goto :goto_4

    .line 186
    :catchall_0
    move-exception v0

    .line 187
    goto/16 :goto_19

    .line 188
    .line 189
    :catch_0
    move-exception v0

    .line 190
    goto :goto_7

    .line 191
    :catchall_1
    move-exception v0

    .line 192
    const/4 v6, 0x0

    .line 193
    goto/16 :goto_18

    .line 194
    .line 195
    :catch_1
    move-exception v0

    .line 196
    const/4 v8, 0x0

    .line 197
    :goto_7
    :try_start_2
    sget-boolean v2, Lq0/a;->m:Z

    .line 198
    .line 199
    if-eqz v2, :cond_10

    .line 200
    .line 201
    const-string v2, "ExifInterface"

    .line 202
    .line 203
    const-string v6, "Exception parsing HEIF file type box."

    .line 204
    .line 205
    invoke-static {v2, v6, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 206
    .line 207
    .line 208
    :cond_10
    if-eqz v8, :cond_12

    .line 209
    .line 210
    :cond_11
    :goto_8
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 211
    .line 212
    .line 213
    :cond_12
    move v0, v4

    .line 214
    :goto_9
    if-eqz v0, :cond_13

    .line 215
    .line 216
    const/16 v0, 0xc

    .line 217
    .line 218
    return v0

    .line 219
    :cond_13
    :try_start_3
    new-instance v2, Lq0/a$b;

    .line 220
    .line 221
    invoke-direct {v2, v3}, Lq0/a$b;-><init>([B)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 222
    .line 223
    .line 224
    :try_start_4
    invoke-static {v2}, Lq0/a;->s(Lq0/a$b;)Ljava/nio/ByteOrder;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    iput-object v0, v1, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 229
    .line 230
    iput-object v0, v2, Lq0/a$b;->c:Ljava/nio/ByteOrder;

    .line 231
    .line 232
    invoke-virtual {v2}, Lq0/a$b;->readShort()S

    .line 233
    .line 234
    .line 235
    move-result v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 236
    const/16 v6, 0x4f52

    .line 237
    .line 238
    if-eq v0, v6, :cond_15

    .line 239
    .line 240
    const/16 v6, 0x5352

    .line 241
    .line 242
    if-ne v0, v6, :cond_14

    .line 243
    .line 244
    goto :goto_a

    .line 245
    :cond_14
    move v0, v4

    .line 246
    goto :goto_b

    .line 247
    :cond_15
    :goto_a
    const/4 v0, 0x1

    .line 248
    :goto_b
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 249
    .line 250
    .line 251
    goto :goto_d

    .line 252
    :catchall_2
    move-exception v0

    .line 253
    move-object v6, v2

    .line 254
    goto :goto_c

    .line 255
    :catchall_3
    move-exception v0

    .line 256
    const/4 v6, 0x0

    .line 257
    :goto_c
    if-eqz v6, :cond_16

    .line 258
    .line 259
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 260
    .line 261
    .line 262
    :cond_16
    throw v0

    .line 263
    :catch_2
    const/4 v2, 0x0

    .line 264
    :catch_3
    if-eqz v2, :cond_17

    .line 265
    .line 266
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 267
    .line 268
    .line 269
    :cond_17
    move v0, v4

    .line 270
    :goto_d
    if-eqz v0, :cond_18

    .line 271
    .line 272
    const/4 v0, 0x7

    .line 273
    return v0

    .line 274
    :cond_18
    :try_start_5
    new-instance v2, Lq0/a$b;

    .line 275
    .line 276
    invoke-direct {v2, v3}, Lq0/a$b;-><init>([B)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 277
    .line 278
    .line 279
    :try_start_6
    invoke-static {v2}, Lq0/a;->s(Lq0/a$b;)Ljava/nio/ByteOrder;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    iput-object v0, v1, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 284
    .line 285
    iput-object v0, v2, Lq0/a$b;->c:Ljava/nio/ByteOrder;

    .line 286
    .line 287
    invoke-virtual {v2}, Lq0/a$b;->readShort()S

    .line 288
    .line 289
    .line 290
    move-result v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 291
    const/16 v6, 0x55

    .line 292
    .line 293
    if-ne v0, v6, :cond_19

    .line 294
    .line 295
    const/4 v0, 0x1

    .line 296
    goto :goto_e

    .line 297
    :cond_19
    move v0, v4

    .line 298
    :goto_e
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 299
    .line 300
    .line 301
    goto :goto_11

    .line 302
    :catchall_4
    move-exception v0

    .line 303
    move-object v6, v2

    .line 304
    goto :goto_f

    .line 305
    :catch_4
    move-object v6, v2

    .line 306
    goto :goto_10

    .line 307
    :catchall_5
    move-exception v0

    .line 308
    const/4 v6, 0x0

    .line 309
    :goto_f
    if-eqz v6, :cond_1a

    .line 310
    .line 311
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 312
    .line 313
    .line 314
    :cond_1a
    throw v0

    .line 315
    :catch_5
    const/4 v6, 0x0

    .line 316
    :goto_10
    if-eqz v6, :cond_1b

    .line 317
    .line 318
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 319
    .line 320
    .line 321
    :cond_1b
    move v0, v4

    .line 322
    :goto_11
    if-eqz v0, :cond_1c

    .line 323
    .line 324
    const/16 v0, 0xa

    .line 325
    .line 326
    return v0

    .line 327
    :cond_1c
    move v0, v4

    .line 328
    :goto_12
    sget-object v2, Lq0/a;->v:[B

    .line 329
    .line 330
    array-length v6, v2

    .line 331
    if-ge v0, v6, :cond_1e

    .line 332
    .line 333
    aget-byte v6, v3, v0

    .line 334
    .line 335
    aget-byte v2, v2, v0

    .line 336
    .line 337
    if-eq v6, v2, :cond_1d

    .line 338
    .line 339
    move v0, v4

    .line 340
    goto :goto_13

    .line 341
    :cond_1d
    add-int/lit8 v0, v0, 0x1

    .line 342
    .line 343
    goto :goto_12

    .line 344
    :cond_1e
    const/4 v0, 0x1

    .line 345
    :goto_13
    if-eqz v0, :cond_1f

    .line 346
    .line 347
    const/16 v0, 0xd

    .line 348
    .line 349
    return v0

    .line 350
    :cond_1f
    move v0, v4

    .line 351
    :goto_14
    sget-object v2, Lq0/a;->z:[B

    .line 352
    .line 353
    array-length v6, v2

    .line 354
    if-ge v0, v6, :cond_21

    .line 355
    .line 356
    aget-byte v6, v3, v0

    .line 357
    .line 358
    aget-byte v2, v2, v0

    .line 359
    .line 360
    if-eq v6, v2, :cond_20

    .line 361
    .line 362
    goto :goto_16

    .line 363
    :cond_20
    add-int/lit8 v0, v0, 0x1

    .line 364
    .line 365
    goto :goto_14

    .line 366
    :cond_21
    move v0, v4

    .line 367
    :goto_15
    sget-object v6, Lq0/a;->A:[B

    .line 368
    .line 369
    array-length v7, v6

    .line 370
    if-ge v0, v7, :cond_23

    .line 371
    .line 372
    array-length v7, v2

    .line 373
    add-int/2addr v7, v0

    .line 374
    add-int/2addr v7, v5

    .line 375
    aget-byte v7, v3, v7

    .line 376
    .line 377
    aget-byte v6, v6, v0

    .line 378
    .line 379
    if-eq v7, v6, :cond_22

    .line 380
    .line 381
    :goto_16
    move v7, v4

    .line 382
    goto :goto_17

    .line 383
    :cond_22
    add-int/lit8 v0, v0, 0x1

    .line 384
    .line 385
    goto :goto_15

    .line 386
    :cond_23
    const/4 v7, 0x1

    .line 387
    :goto_17
    if-eqz v7, :cond_24

    .line 388
    .line 389
    const/16 v0, 0xe

    .line 390
    .line 391
    return v0

    .line 392
    :cond_24
    return v4

    .line 393
    :catchall_6
    move-exception v0

    .line 394
    move-object v6, v8

    .line 395
    :goto_18
    move-object v8, v6

    .line 396
    :goto_19
    if-eqz v8, :cond_25

    .line 397
    .line 398
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 399
    .line 400
    .line 401
    :cond_25
    throw v0
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
.end method

.method public final i(Lq0/a$b;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1}, Lq0/a;->l(Lq0/a$b;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lq0/a;->d:[Ljava/util/HashMap;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    aget-object v1, p1, v0

    .line 8
    .line 9
    const-string v2, "MakerNote"

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lq0/a$c;

    .line 16
    .line 17
    if-eqz v1, :cond_6

    .line 18
    .line 19
    new-instance v2, Lq0/a$b;

    .line 20
    .line 21
    iget-object v1, v1, Lq0/a$c;->c:[B

    .line 22
    .line 23
    invoke-direct {v2, v1}, Lq0/a$b;-><init>([B)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    iput-object v1, v2, Lq0/a$b;->c:Ljava/nio/ByteOrder;

    .line 29
    .line 30
    sget-object v1, Lq0/a;->t:[B

    .line 31
    .line 32
    array-length v3, v1

    .line 33
    new-array v3, v3, [B

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Lq0/a$b;->readFully([B)V

    .line 36
    .line 37
    .line 38
    const-wide/16 v4, 0x0

    .line 39
    .line 40
    invoke-virtual {v2, v4, v5}, Lq0/a$b;->c(J)V

    .line 41
    .line 42
    .line 43
    sget-object v4, Lq0/a;->u:[B

    .line 44
    .line 45
    array-length v5, v4

    .line 46
    new-array v5, v5, [B

    .line 47
    .line 48
    invoke-virtual {v2, v5}, Lq0/a$b;->readFully([B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v3, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    const-wide/16 v3, 0x8

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-static {v5, v4}, Ljava/util/Arrays;->equals([B[B)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    const-wide/16 v3, 0xc

    .line 67
    .line 68
    :goto_0
    invoke-virtual {v2, v3, v4}, Lq0/a$b;->c(J)V

    .line 69
    .line 70
    .line 71
    :cond_1
    const/4 v1, 0x6

    .line 72
    invoke-virtual {p0, v2, v1}, Lq0/a;->u(Lq0/a$b;I)V

    .line 73
    .line 74
    .line 75
    const/4 v1, 0x7

    .line 76
    aget-object v2, p1, v1

    .line 77
    .line 78
    const-string v3, "PreviewImageStart"

    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lq0/a$c;

    .line 85
    .line 86
    aget-object v1, p1, v1

    .line 87
    .line 88
    const-string v3, "PreviewImageLength"

    .line 89
    .line 90
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, Lq0/a$c;

    .line 95
    .line 96
    if-eqz v2, :cond_2

    .line 97
    .line 98
    if-eqz v1, :cond_2

    .line 99
    .line 100
    const/4 v3, 0x5

    .line 101
    aget-object v4, p1, v3

    .line 102
    .line 103
    const-string v5, "JPEGInterchangeFormat"

    .line 104
    .line 105
    invoke-virtual {v4, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    aget-object v2, p1, v3

    .line 109
    .line 110
    const-string v3, "JPEGInterchangeFormatLength"

    .line 111
    .line 112
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    :cond_2
    const/16 v1, 0x8

    .line 116
    .line 117
    aget-object v1, p1, v1

    .line 118
    .line 119
    const-string v2, "AspectFrame"

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    check-cast v1, Lq0/a$c;

    .line 126
    .line 127
    if-eqz v1, :cond_6

    .line 128
    .line 129
    iget-object v2, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Lq0/a$c;->h(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    check-cast v1, [I

    .line 136
    .line 137
    if-eqz v1, :cond_5

    .line 138
    .line 139
    array-length v2, v1

    .line 140
    const/4 v3, 0x4

    .line 141
    if-eq v2, v3, :cond_3

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_3
    const/4 v2, 0x2

    .line 145
    aget v2, v1, v2

    .line 146
    .line 147
    const/4 v3, 0x0

    .line 148
    aget v4, v1, v3

    .line 149
    .line 150
    if-le v2, v4, :cond_6

    .line 151
    .line 152
    const/4 v5, 0x3

    .line 153
    aget v5, v1, v5

    .line 154
    .line 155
    aget v1, v1, v0

    .line 156
    .line 157
    if-le v5, v1, :cond_6

    .line 158
    .line 159
    sub-int/2addr v2, v4

    .line 160
    add-int/2addr v2, v0

    .line 161
    sub-int/2addr v5, v1

    .line 162
    add-int/2addr v5, v0

    .line 163
    if-ge v2, v5, :cond_4

    .line 164
    .line 165
    add-int/2addr v2, v5

    .line 166
    sub-int v5, v2, v5

    .line 167
    .line 168
    sub-int/2addr v2, v5

    .line 169
    :cond_4
    iget-object v0, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 170
    .line 171
    invoke-static {v2, v0}, Lq0/a$c;->d(ILjava/nio/ByteOrder;)Lq0/a$c;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    iget-object v1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 176
    .line 177
    invoke-static {v5, v1}, Lq0/a$c;->d(ILjava/nio/ByteOrder;)Lq0/a$c;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    aget-object v2, p1, v3

    .line 182
    .line 183
    const-string v4, "ImageWidth"

    .line 184
    .line 185
    invoke-virtual {v2, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    aget-object p1, p1, v3

    .line 189
    .line 190
    const-string v0, "ImageLength"

    .line 191
    .line 192
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_5
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    const-string v0, "Invalid aspect frame values. frame="

    .line 199
    .line 200
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    const-string v0, "ExifInterface"

    .line 215
    .line 216
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    .line 218
    .line 219
    :cond_6
    :goto_2
    return-void
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
.end method

.method public final j(Lq0/a$b;)V
    .locals 6

    .line 1
    sget-boolean v0, Lq0/a;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "getPngAttributes starting with: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "ExifInterface"

    .line 20
    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    iput-object v0, p1, Lq0/a$b;->c:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    sget-object v0, Lq0/a;->v:[B

    .line 29
    .line 30
    array-length v1, v0

    .line 31
    invoke-virtual {p1, v1}, Lq0/a$b;->skipBytes(I)I

    .line 32
    .line 33
    .line 34
    array-length v0, v0

    .line 35
    const/4 v1, 0x0

    .line 36
    add-int/2addr v0, v1

    .line 37
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Lq0/a$b;->readInt()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v3, 0x4

    .line 42
    add-int/2addr v0, v3

    .line 43
    new-array v4, v3, [B

    .line 44
    .line 45
    invoke-virtual {p1, v4}, Ljava/io/InputStream;->read([B)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-ne v5, v3, :cond_7

    .line 50
    .line 51
    add-int/2addr v0, v3

    .line 52
    const/16 v3, 0x10

    .line 53
    .line 54
    if-ne v0, v3, :cond_2

    .line 55
    .line 56
    sget-object v3, Lq0/a;->x:[B

    .line 57
    .line 58
    invoke-static {v4, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 66
    .line 67
    const-string v0, "Encountered invalid PNG file--IHDR chunk should appearas the first chunk"

    .line 68
    .line 69
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_2
    :goto_1
    sget-object v3, Lq0/a;->y:[B

    .line 74
    .line 75
    invoke-static {v4, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_3

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    sget-object v3, Lq0/a;->w:[B

    .line 83
    .line 84
    invoke-static {v4, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_6

    .line 89
    .line 90
    new-array v3, v2, [B

    .line 91
    .line 92
    invoke-virtual {p1, v3}, Ljava/io/InputStream;->read([B)I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-ne v5, v2, :cond_5

    .line 97
    .line 98
    invoke-virtual {p1}, Lq0/a$b;->readInt()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    new-instance v2, Ljava/util/zip/CRC32;

    .line 103
    .line 104
    invoke-direct {v2}, Ljava/util/zip/CRC32;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v4}, Ljava/util/zip/CRC32;->update([B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ljava/util/zip/CRC32;->update([B)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    .line 114
    .line 115
    .line 116
    move-result-wide v4

    .line 117
    long-to-int v4, v4

    .line 118
    if-ne v4, p1, :cond_4

    .line 119
    .line 120
    iput v0, p0, Lq0/a;->h:I

    .line 121
    .line 122
    invoke-virtual {p0, v3, v1}, Lq0/a;->t([BI)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Lq0/a;->y()V

    .line 126
    .line 127
    .line 128
    :goto_2
    return-void

    .line 129
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 130
    .line 131
    new-instance v1, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    const-string v3, "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: "

    .line 137
    .line 138
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string p1, ", calculated CRC value: "

    .line 145
    .line 146
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    .line 150
    .line 151
    .line 152
    move-result-wide v2

    .line 153
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v0

    .line 164
    :cond_5
    new-instance p1, Ljava/io/IOException;

    .line 165
    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    const-string v1, "Failed to read given length for given PNG chunk type: "

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-static {v4}, Lq0/a;->b([B)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p1

    .line 191
    :cond_6
    add-int/lit8 v2, v2, 0x4

    .line 192
    .line 193
    invoke-virtual {p1, v2}, Lq0/a$b;->skipBytes(I)I

    .line 194
    .line 195
    .line 196
    add-int/2addr v0, v2

    .line 197
    goto/16 :goto_0

    .line 198
    .line 199
    :cond_7
    new-instance p1, Ljava/io/IOException;

    .line 200
    .line 201
    const-string v0, "Encountered invalid length while parsing PNG chunktype"

    .line 202
    .line 203
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 207
    :catch_0
    new-instance p1, Ljava/io/IOException;

    .line 208
    .line 209
    const-string v0, "Encountered corrupt PNG file."

    .line 210
    .line 211
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw p1
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
.end method

.method public final k(Lq0/a$b;)V
    .locals 9

    .line 1
    const/16 v0, 0x54

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lq0/a$b;->skipBytes(I)I

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    new-array v1, v0, [B

    .line 8
    .line 9
    new-array v2, v0, [B

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lq0/a$b;->skipBytes(I)I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v2}, Ljava/io/InputStream;->read([B)I

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/4 v2, 0x5

    .line 37
    invoke-virtual {p0, p1, v0, v2}, Lq0/a;->g(Lq0/a$b;II)V

    .line 38
    .line 39
    .line 40
    int-to-long v0, v1

    .line 41
    invoke-virtual {p1, v0, v1}, Lq0/a$b;->c(J)V

    .line 42
    .line 43
    .line 44
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 45
    .line 46
    iput-object v0, p1, Lq0/a$b;->c:Ljava/nio/ByteOrder;

    .line 47
    .line 48
    invoke-virtual {p1}, Lq0/a$b;->readInt()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const-string v1, "ExifInterface"

    .line 53
    .line 54
    sget-boolean v2, Lq0/a;->m:Z

    .line 55
    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v4, "numberOfDirectoryEntry: "

    .line 61
    .line 62
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    :cond_0
    const/4 v3, 0x0

    .line 76
    move v4, v3

    .line 77
    :goto_0
    if-ge v4, v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {p1}, Lq0/a$b;->readUnsignedShort()I

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    invoke-virtual {p1}, Lq0/a$b;->readUnsignedShort()I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    sget-object v7, Lq0/a;->F:Lq0/a$d;

    .line 88
    .line 89
    iget v7, v7, Lq0/a$d;->a:I

    .line 90
    .line 91
    if-ne v5, v7, :cond_2

    .line 92
    .line 93
    invoke-virtual {p1}, Lq0/a$b;->readShort()S

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    invoke-virtual {p1}, Lq0/a$b;->readShort()S

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    iget-object v4, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 102
    .line 103
    invoke-static {v0, v4}, Lq0/a$c;->d(ILjava/nio/ByteOrder;)Lq0/a$c;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    iget-object v5, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 108
    .line 109
    invoke-static {p1, v5}, Lq0/a$c;->d(ILjava/nio/ByteOrder;)Lq0/a$c;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    iget-object v6, p0, Lq0/a;->d:[Ljava/util/HashMap;

    .line 114
    .line 115
    aget-object v7, v6, v3

    .line 116
    .line 117
    const-string v8, "ImageLength"

    .line 118
    .line 119
    invoke-virtual {v7, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    aget-object v3, v6, v3

    .line 123
    .line 124
    const-string v4, "ImageWidth"

    .line 125
    .line 126
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    if-eqz v2, :cond_1

    .line 130
    .line 131
    new-instance v2, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v3, "Updated to length: "

    .line 134
    .line 135
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v0, ", width: "

    .line 142
    .line 143
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    :cond_1
    return-void

    .line 157
    :cond_2
    invoke-virtual {p1, v6}, Lq0/a$b;->skipBytes(I)I

    .line 158
    .line 159
    .line 160
    add-int/lit8 v4, v4, 0x1

    .line 161
    .line 162
    goto :goto_0

    .line 163
    :cond_3
    return-void
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
.end method

.method public final l(Lq0/a$b;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lq0/a$b;->available()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, p1, v0}, Lq0/a;->q(Lq0/a$b;I)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, p1, v0}, Lq0/a;->u(Lq0/a$b;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, v0}, Lq0/a;->x(Lq0/a$b;I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x5

    .line 16
    invoke-virtual {p0, p1, v0}, Lq0/a;->x(Lq0/a$b;I)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    invoke-virtual {p0, p1, v0}, Lq0/a;->x(Lq0/a$b;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lq0/a;->y()V

    .line 24
    .line 25
    .line 26
    iget p1, p0, Lq0/a;->c:I

    .line 27
    .line 28
    const/16 v0, 0x8

    .line 29
    .line 30
    if-ne p1, v0, :cond_0

    .line 31
    .line 32
    iget-object p1, p0, Lq0/a;->d:[Ljava/util/HashMap;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    aget-object v1, p1, v0

    .line 36
    .line 37
    const-string v2, "MakerNote"

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, Lq0/a$c;

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    new-instance v2, Lq0/a$b;

    .line 48
    .line 49
    iget-object v1, v1, Lq0/a$c;->c:[B

    .line 50
    .line 51
    invoke-direct {v2, v1}, Lq0/a$b;-><init>([B)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 55
    .line 56
    iput-object v1, v2, Lq0/a$b;->c:Ljava/nio/ByteOrder;

    .line 57
    .line 58
    const-wide/16 v3, 0x6

    .line 59
    .line 60
    invoke-virtual {v2, v3, v4}, Lq0/a$b;->c(J)V

    .line 61
    .line 62
    .line 63
    const/16 v1, 0x9

    .line 64
    .line 65
    invoke-virtual {p0, v2, v1}, Lq0/a;->u(Lq0/a$b;I)V

    .line 66
    .line 67
    .line 68
    aget-object v1, p1, v1

    .line 69
    .line 70
    const-string v2, "ColorSpace"

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Lq0/a$c;

    .line 77
    .line 78
    if-eqz v1, :cond_0

    .line 79
    .line 80
    aget-object p1, p1, v0

    .line 81
    .line 82
    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    :cond_0
    return-void
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method

.method public final m(Lq0/a$b;)V
    .locals 4

    invoke-virtual {p0, p1}, Lq0/a;->l(Lq0/a$b;)V

    iget-object v0, p0, Lq0/a;->d:[Ljava/util/HashMap;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    const-string v3, "JpgFromRaw"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq0/a$c;

    if-eqz v2, :cond_0

    iget v2, p0, Lq0/a;->l:I

    const/4 v3, 0x5

    invoke-virtual {p0, p1, v2, v3}, Lq0/a;->g(Lq0/a$b;II)V

    :cond_0
    aget-object p1, v0, v1

    const-string v1, "ISO"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq0/a$c;

    const/4 v1, 0x1

    aget-object v2, v0, v1

    const-string v3, "PhotographicSensitivity"

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq0/a$c;

    if-eqz p1, :cond_1

    if-nez v2, :cond_1

    aget-object v0, v0, v1

    invoke-virtual {v0, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final n(Lq0/a$b;)V
    .locals 5

    .line 1
    sget-boolean v0, Lq0/a;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "getWebpAttributes starting with: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "ExifInterface"

    .line 20
    .line 21
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 25
    .line 26
    iput-object v0, p1, Lq0/a$b;->c:Ljava/nio/ByteOrder;

    .line 27
    .line 28
    sget-object v0, Lq0/a;->z:[B

    .line 29
    .line 30
    array-length v0, v0

    .line 31
    invoke-virtual {p1, v0}, Lq0/a$b;->skipBytes(I)I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lq0/a$b;->readInt()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-int/lit8 v0, v0, 0x8

    .line 39
    .line 40
    sget-object v1, Lq0/a;->A:[B

    .line 41
    .line 42
    array-length v1, v1

    .line 43
    invoke-virtual {p1, v1}, Lq0/a$b;->skipBytes(I)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/lit8 v1, v1, 0x8

    .line 48
    .line 49
    :goto_0
    const/4 v2, 0x4

    .line 50
    :try_start_0
    new-array v3, v2, [B

    .line 51
    .line 52
    invoke-virtual {p1, v3}, Ljava/io/InputStream;->read([B)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-ne v4, v2, :cond_7

    .line 57
    .line 58
    add-int/2addr v1, v2

    .line 59
    invoke-virtual {p1}, Lq0/a$b;->readInt()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    add-int/2addr v1, v2

    .line 64
    sget-object v2, Lq0/a;->B:[B

    .line 65
    .line 66
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    new-array v0, v4, [B

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-ne p1, v4, :cond_1

    .line 79
    .line 80
    iput v1, p0, Lq0/a;->h:I

    .line 81
    .line 82
    const/4 p1, 0x0

    .line 83
    invoke-virtual {p0, v0, p1}, Lq0/a;->t([BI)V

    .line 84
    .line 85
    .line 86
    iput v1, p0, Lq0/a;->h:I

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 90
    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    .line 96
    const-string v1, "Failed to read given length for given PNG chunk type: "

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-static {v3}, Lq0/a;->b([B)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_2
    rem-int/lit8 v2, v4, 0x2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    .line 118
    const/4 v3, 0x1

    .line 119
    if-ne v2, v3, :cond_3

    .line 120
    .line 121
    add-int/lit8 v4, v4, 0x1

    .line 122
    .line 123
    :cond_3
    add-int v2, v1, v4

    .line 124
    .line 125
    if-ne v2, v0, :cond_4

    .line 126
    .line 127
    :goto_1
    return-void

    .line 128
    :cond_4
    const-string v3, "Encountered WebP file with invalid chunk size"

    .line 129
    .line 130
    if-gt v2, v0, :cond_6

    .line 131
    .line 132
    :try_start_1
    invoke-virtual {p1, v4}, Lq0/a$b;->skipBytes(I)I

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-ne v2, v4, :cond_5

    .line 137
    .line 138
    add-int/2addr v1, v2

    .line 139
    goto :goto_0

    .line 140
    :cond_5
    new-instance p1, Ljava/io/IOException;

    .line 141
    .line 142
    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p1

    .line 146
    :cond_6
    new-instance p1, Ljava/io/IOException;

    .line 147
    .line 148
    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw p1

    .line 152
    :cond_7
    new-instance p1, Ljava/io/IOException;

    .line 153
    .line 154
    const-string v0, "Encountered invalid length while parsing WebP chunktype"

    .line 155
    .line 156
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p1
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    .line 160
    :catch_0
    new-instance p1, Ljava/io/IOException;

    .line 161
    .line 162
    const-string v0, "Encountered corrupt WebP file."

    .line 163
    .line 164
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p1
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
.end method

.method public final o(Lq0/a$b;Ljava/util/HashMap;)V
    .locals 5

    .line 1
    const-string v0, "JPEGInterchangeFormat"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lq0/a$c;

    .line 8
    .line 9
    const-string v1, "JPEGInterchangeFormatLength"

    .line 10
    .line 11
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Lq0/a$c;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 28
    .line 29
    invoke-virtual {p2, v1}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iget v1, p0, Lq0/a;->c:I

    .line 34
    .line 35
    const/4 v2, 0x7

    .line 36
    if-ne v1, v2, :cond_0

    .line 37
    .line 38
    iget v1, p0, Lq0/a;->i:I

    .line 39
    .line 40
    add-int/2addr v0, v1

    .line 41
    :cond_0
    iget v1, p1, Lq0/a$b;->d:I

    .line 42
    .line 43
    sub-int/2addr v1, v0

    .line 44
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-lez v0, :cond_1

    .line 49
    .line 50
    if-lez p2, :cond_1

    .line 51
    .line 52
    iget v1, p0, Lq0/a;->h:I

    .line 53
    .line 54
    add-int/2addr v1, v0

    .line 55
    iget-object v2, p0, Lq0/a;->b:Landroid/content/res/AssetManager$AssetInputStream;

    .line 56
    .line 57
    if-nez v2, :cond_1

    .line 58
    .line 59
    iget-object v2, p0, Lq0/a;->a:Ljava/io/FileDescriptor;

    .line 60
    .line 61
    if-nez v2, :cond_1

    .line 62
    .line 63
    new-array v2, p2, [B

    .line 64
    .line 65
    int-to-long v3, v1

    .line 66
    invoke-virtual {p1, v3, v4}, Lq0/a$b;->c(J)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v2}, Lq0/a$b;->readFully([B)V

    .line 70
    .line 71
    .line 72
    :cond_1
    sget-boolean p1, Lq0/a;->m:Z

    .line 73
    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    new-instance p1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v1, "Setting thumbnail attributes with offset: "

    .line 79
    .line 80
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v0, ", length: "

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const-string p2, "ExifInterface"

    .line 99
    .line 100
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    :cond_2
    return-void
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method

.method public final p(Ljava/util/HashMap;)Z
    .locals 2

    const-string v0, "ImageLength"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq0/a$c;

    const-string v1, "ImageWidth"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq0/a$c;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    move-result v0

    iget-object v1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v1}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    move-result p1

    const/16 v1, 0x200

    if-gt v0, v1, :cond_0

    if-gt p1, v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final q(Lq0/a$b;I)V
    .locals 3

    .line 1
    invoke-static {p1}, Lq0/a;->s(Lq0/a$b;)Ljava/nio/ByteOrder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    iput-object v0, p1, Lq0/a$b;->c:Ljava/nio/ByteOrder;

    .line 8
    .line 9
    invoke-virtual {p1}, Lq0/a$b;->readUnsignedShort()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lq0/a;->c:I

    .line 14
    .line 15
    const/4 v2, 0x7

    .line 16
    if-eq v1, v2, :cond_1

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    if-eq v1, v2, :cond_1

    .line 21
    .line 22
    const/16 v1, 0x2a

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/io/IOException;

    .line 28
    .line 29
    new-instance p2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, "Invalid start code: "

    .line 32
    .line 33
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lq0/a$b;->readInt()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/16 v1, 0x8

    .line 56
    .line 57
    if-lt v0, v1, :cond_4

    .line 58
    .line 59
    if-ge v0, p2, :cond_4

    .line 60
    .line 61
    add-int/lit8 v0, v0, -0x8

    .line 62
    .line 63
    if-lez v0, :cond_3

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lq0/a$b;->skipBytes(I)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-ne p1, v0, :cond_2

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 73
    .line 74
    const-string p2, "Couldn\'t jump to first Ifd: "

    .line 75
    .line 76
    invoke-static {p2, v0}, Landroidx/activity/j;->a(Ljava/lang/String;I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1

    .line 84
    :cond_3
    :goto_1
    return-void

    .line 85
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 86
    .line 87
    const-string p2, "Invalid first Ifd offset: "

    .line 88
    .line 89
    invoke-static {p2, v0}, Landroidx/activity/j;->a(Ljava/lang/String;I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method

.method public final r()V
    .locals 7

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lq0/a;->d:[Ljava/util/HashMap;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The size of tag group["

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "]: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v3, v1, v0

    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ExifInterface"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    aget-object v1, v1, v0

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq0/a$c;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "tagName: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", tagType: "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lq0/a$c;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", tagValue: \'"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    invoke-virtual {v4, v2}, Lq0/a$c;->g(Ljava/nio/ByteOrder;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final t([BI)V
    .locals 1

    new-instance v0, Lq0/a$b;

    invoke-direct {v0, p1}, Lq0/a$b;-><init>([B)V

    array-length p1, p1

    invoke-virtual {p0, v0, p1}, Lq0/a;->q(Lq0/a$b;I)V

    invoke-virtual {p0, v0, p2}, Lq0/a;->u(Lq0/a$b;I)V

    return-void
.end method

.method public final u(Lq0/a$b;I)V
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, Lq0/a$b;->e:I

    .line 8
    .line 9
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, v0, Lq0/a;->e:Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    iget v3, v1, Lq0/a$b;->e:I

    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    add-int/2addr v3, v5

    .line 22
    iget v6, v1, Lq0/a$b;->d:I

    .line 23
    .line 24
    if-le v3, v6, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readShort()S

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    sget-boolean v7, Lq0/a;->m:Z

    .line 32
    .line 33
    const-string v8, "ExifInterface"

    .line 34
    .line 35
    if-eqz v7, :cond_1

    .line 36
    .line 37
    new-instance v9, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v10, "numberOfDirectoryEntry: "

    .line 40
    .line 41
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v9

    .line 51
    invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    :cond_1
    iget v9, v1, Lq0/a$b;->e:I

    .line 55
    .line 56
    mul-int/lit8 v10, v3, 0xc

    .line 57
    .line 58
    add-int/2addr v10, v9

    .line 59
    if-gt v10, v6, :cond_36

    .line 60
    .line 61
    if-gtz v3, :cond_2

    .line 62
    .line 63
    goto/16 :goto_18

    .line 64
    .line 65
    :cond_2
    move-object v11, v1

    .line 66
    const/4 v10, 0x0

    .line 67
    :goto_0
    iget-object v14, v0, Lq0/a;->d:[Ljava/util/HashMap;

    .line 68
    .line 69
    if-ge v10, v3, :cond_31

    .line 70
    .line 71
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readUnsignedShort()I

    .line 72
    .line 73
    .line 74
    move-result v13

    .line 75
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readUnsignedShort()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readInt()I

    .line 80
    .line 81
    .line 82
    move-result v15

    .line 83
    iget v9, v11, Lq0/a$b;->e:I

    .line 84
    .line 85
    move/from16 v21, v13

    .line 86
    .line 87
    int-to-long v12, v9

    .line 88
    const-wide/16 v22, 0x4

    .line 89
    .line 90
    add-long v12, v12, v22

    .line 91
    .line 92
    sget-object v9, Lq0/a;->I:[Ljava/util/HashMap;

    .line 93
    .line 94
    aget-object v9, v9, v2

    .line 95
    .line 96
    move/from16 v24, v3

    .line 97
    .line 98
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v9, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Lq0/a$d;

    .line 107
    .line 108
    if-eqz v7, :cond_4

    .line 109
    .line 110
    const/4 v9, 0x5

    .line 111
    new-array v9, v9, [Ljava/lang/Object;

    .line 112
    .line 113
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v20

    .line 117
    const/16 v19, 0x0

    .line 118
    .line 119
    aput-object v20, v9, v19

    .line 120
    .line 121
    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v20

    .line 125
    const/16 v18, 0x1

    .line 126
    .line 127
    aput-object v20, v9, v18

    .line 128
    .line 129
    move/from16 v20, v10

    .line 130
    .line 131
    if-eqz v3, :cond_3

    .line 132
    .line 133
    iget-object v10, v3, Lq0/a$d;->b:Ljava/lang/String;

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_3
    const/4 v10, 0x0

    .line 137
    :goto_1
    const/16 v17, 0x2

    .line 138
    .line 139
    aput-object v10, v9, v17

    .line 140
    .line 141
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    const/16 v25, 0x3

    .line 146
    .line 147
    aput-object v10, v9, v25

    .line 148
    .line 149
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    const/16 v16, 0x4

    .line 154
    .line 155
    aput-object v10, v9, v16

    .line 156
    .line 157
    const-string v10, "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"

    .line 158
    .line 159
    invoke-static {v10, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_4
    move/from16 v20, v10

    .line 168
    .line 169
    :goto_2
    if-nez v3, :cond_6

    .line 170
    .line 171
    if-eqz v7, :cond_5

    .line 172
    .line 173
    new-instance v9, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string v10, "Skip the tag entry since tag number is not defined: "

    .line 176
    .line 177
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    move/from16 v10, v21

    .line 181
    .line 182
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_5
    move/from16 v10, v21

    .line 194
    .line 195
    :goto_3
    move-object/from16 v21, v4

    .line 196
    .line 197
    move/from16 v27, v10

    .line 198
    .line 199
    goto/16 :goto_9

    .line 200
    .line 201
    :cond_6
    move/from16 v10, v21

    .line 202
    .line 203
    if-lez v5, :cond_15

    .line 204
    .line 205
    sget-object v9, Lq0/a;->D:[I

    .line 206
    .line 207
    move-object/from16 v21, v4

    .line 208
    .line 209
    array-length v4, v9

    .line 210
    if-lt v5, v4, :cond_7

    .line 211
    .line 212
    goto/16 :goto_7

    .line 213
    .line 214
    :cond_7
    iget v4, v3, Lq0/a$d;->c:I

    .line 215
    .line 216
    move/from16 v27, v10

    .line 217
    .line 218
    const/4 v10, 0x7

    .line 219
    if-eq v4, v10, :cond_10

    .line 220
    .line 221
    if-ne v5, v10, :cond_8

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_8
    if-eq v4, v5, :cond_10

    .line 225
    .line 226
    iget v10, v3, Lq0/a$d;->d:I

    .line 227
    .line 228
    if-ne v10, v5, :cond_9

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_9
    const/4 v1, 0x4

    .line 232
    if-eq v4, v1, :cond_a

    .line 233
    .line 234
    if-ne v10, v1, :cond_b

    .line 235
    .line 236
    :cond_a
    const/4 v1, 0x3

    .line 237
    if-ne v5, v1, :cond_b

    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_b
    const/16 v1, 0x9

    .line 241
    .line 242
    if-eq v4, v1, :cond_c

    .line 243
    .line 244
    if-ne v10, v1, :cond_d

    .line 245
    .line 246
    :cond_c
    const/16 v1, 0x8

    .line 247
    .line 248
    if-ne v5, v1, :cond_d

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_d
    const/16 v1, 0xc

    .line 252
    .line 253
    if-eq v4, v1, :cond_e

    .line 254
    .line 255
    if-ne v10, v1, :cond_f

    .line 256
    .line 257
    :cond_e
    const/16 v1, 0xb

    .line 258
    .line 259
    if-ne v5, v1, :cond_f

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_f
    const/4 v1, 0x0

    .line 263
    goto :goto_5

    .line 264
    :cond_10
    :goto_4
    const/4 v1, 0x1

    .line 265
    :goto_5
    if-nez v1, :cond_11

    .line 266
    .line 267
    if-eqz v7, :cond_16

    .line 268
    .line 269
    new-instance v1, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    const-string v4, "Skip the tag entry since data format ("

    .line 272
    .line 273
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    sget-object v4, Lq0/a;->C:[Ljava/lang/String;

    .line 277
    .line 278
    aget-object v4, v4, v5

    .line 279
    .line 280
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string v4, ") is unexpected for tag: "

    .line 284
    .line 285
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    iget-object v4, v3, Lq0/a$d;->b:Ljava/lang/String;

    .line 289
    .line 290
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    goto :goto_8

    .line 294
    :cond_11
    const/4 v1, 0x7

    .line 295
    if-ne v5, v1, :cond_12

    .line 296
    .line 297
    move v5, v4

    .line 298
    :cond_12
    int-to-long v1, v15

    .line 299
    aget v4, v9, v5

    .line 300
    .line 301
    int-to-long v9, v4

    .line 302
    mul-long/2addr v1, v9

    .line 303
    const-wide/16 v9, 0x0

    .line 304
    .line 305
    cmp-long v4, v1, v9

    .line 306
    .line 307
    if-ltz v4, :cond_14

    .line 308
    .line 309
    const-wide/32 v9, 0x7fffffff

    .line 310
    .line 311
    .line 312
    cmp-long v4, v1, v9

    .line 313
    .line 314
    if-lez v4, :cond_13

    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_13
    const/4 v4, 0x1

    .line 318
    goto :goto_b

    .line 319
    :cond_14
    :goto_6
    if-eqz v7, :cond_17

    .line 320
    .line 321
    new-instance v4, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    const-string v9, "Skip the tag entry since the number of components is invalid: "

    .line 324
    .line 325
    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    invoke-static {v8, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 336
    .line 337
    .line 338
    goto :goto_a

    .line 339
    :cond_15
    move-object/from16 v21, v4

    .line 340
    .line 341
    :goto_7
    move/from16 v27, v10

    .line 342
    .line 343
    if-eqz v7, :cond_16

    .line 344
    .line 345
    new-instance v1, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    const-string v2, "Skip the tag entry since data format is invalid: "

    .line 348
    .line 349
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    :goto_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-static {v8, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 360
    .line 361
    .line 362
    :cond_16
    :goto_9
    const-wide/16 v1, 0x0

    .line 363
    .line 364
    :cond_17
    :goto_a
    const/4 v4, 0x0

    .line 365
    :goto_b
    if-nez v4, :cond_18

    .line 366
    .line 367
    invoke-virtual {v11, v12, v13}, Lq0/a$b;->c(J)V

    .line 368
    .line 369
    .line 370
    move-object/from16 v12, p1

    .line 371
    .line 372
    move-object/from16 v13, v21

    .line 373
    .line 374
    goto/16 :goto_14

    .line 375
    .line 376
    :cond_18
    cmp-long v4, v1, v22

    .line 377
    .line 378
    const-string v9, "Compression"

    .line 379
    .line 380
    if-lez v4, :cond_21

    .line 381
    .line 382
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readInt()I

    .line 383
    .line 384
    .line 385
    move-result v4

    .line 386
    if-eqz v7, :cond_19

    .line 387
    .line 388
    new-instance v10, Ljava/lang/StringBuilder;

    .line 389
    .line 390
    const-string v11, "seek to data offset: "

    .line 391
    .line 392
    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v10

    .line 402
    invoke-static {v8, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 403
    .line 404
    .line 405
    :cond_19
    iget v10, v0, Lq0/a;->c:I

    .line 406
    .line 407
    const/4 v11, 0x7

    .line 408
    if-ne v10, v11, :cond_1c

    .line 409
    .line 410
    iget-object v10, v3, Lq0/a$d;->b:Ljava/lang/String;

    .line 411
    .line 412
    const-string v11, "MakerNote"

    .line 413
    .line 414
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v10

    .line 418
    if-eqz v10, :cond_1a

    .line 419
    .line 420
    iput v4, v0, Lq0/a;->i:I

    .line 421
    .line 422
    goto :goto_c

    .line 423
    :cond_1a
    const/4 v10, 0x6

    .line 424
    move/from16 v11, p2

    .line 425
    .line 426
    if-ne v11, v10, :cond_1b

    .line 427
    .line 428
    const-string v10, "ThumbnailImage"

    .line 429
    .line 430
    iget-object v11, v3, Lq0/a$d;->b:Ljava/lang/String;

    .line 431
    .line 432
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v10

    .line 436
    if-eqz v10, :cond_1b

    .line 437
    .line 438
    iput v4, v0, Lq0/a;->j:I

    .line 439
    .line 440
    iput v15, v0, Lq0/a;->k:I

    .line 441
    .line 442
    iget-object v10, v0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 443
    .line 444
    const/4 v11, 0x6

    .line 445
    invoke-static {v11, v10}, Lq0/a$c;->d(ILjava/nio/ByteOrder;)Lq0/a$c;

    .line 446
    .line 447
    .line 448
    move-result-object v10

    .line 449
    iget v11, v0, Lq0/a;->j:I

    .line 450
    .line 451
    move-wide/from16 v22, v12

    .line 452
    .line 453
    int-to-long v11, v11

    .line 454
    iget-object v13, v0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 455
    .line 456
    invoke-static {v11, v12, v13}, Lq0/a$c;->b(JLjava/nio/ByteOrder;)Lq0/a$c;

    .line 457
    .line 458
    .line 459
    move-result-object v11

    .line 460
    iget v12, v0, Lq0/a;->k:I

    .line 461
    .line 462
    int-to-long v12, v12

    .line 463
    move/from16 v26, v15

    .line 464
    .line 465
    iget-object v15, v0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 466
    .line 467
    invoke-static {v12, v13, v15}, Lq0/a$c;->b(JLjava/nio/ByteOrder;)Lq0/a$c;

    .line 468
    .line 469
    .line 470
    move-result-object v12

    .line 471
    const/4 v13, 0x4

    .line 472
    aget-object v15, v14, v13

    .line 473
    .line 474
    invoke-virtual {v15, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    aget-object v10, v14, v13

    .line 478
    .line 479
    const-string v15, "JPEGInterchangeFormat"

    .line 480
    .line 481
    invoke-virtual {v10, v15, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    aget-object v10, v14, v13

    .line 485
    .line 486
    const-string v11, "JPEGInterchangeFormatLength"

    .line 487
    .line 488
    invoke-virtual {v10, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    goto :goto_d

    .line 492
    :cond_1b
    :goto_c
    move-wide/from16 v22, v12

    .line 493
    .line 494
    move/from16 v26, v15

    .line 495
    .line 496
    goto :goto_d

    .line 497
    :cond_1c
    move-wide/from16 v22, v12

    .line 498
    .line 499
    move/from16 v26, v15

    .line 500
    .line 501
    const/16 v11, 0xa

    .line 502
    .line 503
    if-ne v10, v11, :cond_1d

    .line 504
    .line 505
    const-string v10, "JpgFromRaw"

    .line 506
    .line 507
    iget-object v11, v3, Lq0/a$d;->b:Ljava/lang/String;

    .line 508
    .line 509
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    move-result v10

    .line 513
    if-eqz v10, :cond_1d

    .line 514
    .line 515
    iput v4, v0, Lq0/a;->l:I

    .line 516
    .line 517
    :cond_1d
    :goto_d
    int-to-long v10, v4

    .line 518
    add-long v12, v10, v1

    .line 519
    .line 520
    move-object/from16 v28, v14

    .line 521
    .line 522
    int-to-long v14, v6

    .line 523
    cmp-long v12, v12, v14

    .line 524
    .line 525
    if-gtz v12, :cond_1e

    .line 526
    .line 527
    move-object/from16 v12, p1

    .line 528
    .line 529
    invoke-virtual {v12, v10, v11}, Lq0/a$b;->c(J)V

    .line 530
    .line 531
    .line 532
    move-object v11, v12

    .line 533
    goto :goto_f

    .line 534
    :cond_1e
    move-object/from16 v12, p1

    .line 535
    .line 536
    if-eqz v7, :cond_1f

    .line 537
    .line 538
    new-instance v1, Ljava/lang/StringBuilder;

    .line 539
    .line 540
    const-string v2, "Skip the tag entry since data offset is invalid: "

    .line 541
    .line 542
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    invoke-static {v8, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 553
    .line 554
    .line 555
    :cond_1f
    move-object v11, v12

    .line 556
    move-object/from16 v13, v21

    .line 557
    .line 558
    :cond_20
    :goto_e
    move-wide/from16 v14, v22

    .line 559
    .line 560
    goto/16 :goto_13

    .line 561
    .line 562
    :cond_21
    move-wide/from16 v22, v12

    .line 563
    .line 564
    move-object/from16 v28, v14

    .line 565
    .line 566
    move/from16 v26, v15

    .line 567
    .line 568
    move-object/from16 v12, p1

    .line 569
    .line 570
    :goto_f
    sget-object v4, Lq0/a;->L:Ljava/util/HashMap;

    .line 571
    .line 572
    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 573
    .line 574
    .line 575
    move-result-object v10

    .line 576
    invoke-virtual {v4, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v4

    .line 580
    check-cast v4, Ljava/lang/Integer;

    .line 581
    .line 582
    if-eqz v7, :cond_22

    .line 583
    .line 584
    new-instance v10, Ljava/lang/StringBuilder;

    .line 585
    .line 586
    const-string v13, "nextIfdType: "

    .line 587
    .line 588
    invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    const-string v13, " byteCount: "

    .line 595
    .line 596
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v10, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v10

    .line 606
    invoke-static {v8, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 607
    .line 608
    .line 609
    :cond_22
    if-eqz v4, :cond_2a

    .line 610
    .line 611
    const/4 v10, 0x3

    .line 612
    if-eq v5, v10, :cond_26

    .line 613
    .line 614
    const/4 v1, 0x4

    .line 615
    if-eq v5, v1, :cond_25

    .line 616
    .line 617
    const/16 v1, 0x8

    .line 618
    .line 619
    if-eq v5, v1, :cond_24

    .line 620
    .line 621
    const/16 v1, 0x9

    .line 622
    .line 623
    if-eq v5, v1, :cond_23

    .line 624
    .line 625
    const/16 v1, 0xd

    .line 626
    .line 627
    if-eq v5, v1, :cond_23

    .line 628
    .line 629
    const-wide/16 v1, -0x1

    .line 630
    .line 631
    goto :goto_11

    .line 632
    :cond_23
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readInt()I

    .line 633
    .line 634
    .line 635
    move-result v1

    .line 636
    goto :goto_10

    .line 637
    :cond_24
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readShort()S

    .line 638
    .line 639
    .line 640
    move-result v1

    .line 641
    goto :goto_10

    .line 642
    :cond_25
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readInt()I

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    int-to-long v1, v1

    .line 647
    const-wide v9, 0xffffffffL

    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    and-long/2addr v1, v9

    .line 653
    goto :goto_11

    .line 654
    :cond_26
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readUnsignedShort()I

    .line 655
    .line 656
    .line 657
    move-result v1

    .line 658
    :goto_10
    int-to-long v1, v1

    .line 659
    :goto_11
    const/4 v10, 0x2

    .line 660
    if-eqz v7, :cond_27

    .line 661
    .line 662
    new-array v5, v10, [Ljava/lang/Object;

    .line 663
    .line 664
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 665
    .line 666
    .line 667
    move-result-object v9

    .line 668
    const/4 v13, 0x0

    .line 669
    aput-object v9, v5, v13

    .line 670
    .line 671
    iget-object v3, v3, Lq0/a$d;->b:Ljava/lang/String;

    .line 672
    .line 673
    const/4 v9, 0x1

    .line 674
    aput-object v3, v5, v9

    .line 675
    .line 676
    const-string v3, "Offset: %d, tagName: %s"

    .line 677
    .line 678
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v3

    .line 682
    invoke-static {v8, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 683
    .line 684
    .line 685
    :cond_27
    const-wide/16 v13, 0x0

    .line 686
    .line 687
    cmp-long v3, v1, v13

    .line 688
    .line 689
    if-lez v3, :cond_29

    .line 690
    .line 691
    int-to-long v13, v6

    .line 692
    cmp-long v3, v1, v13

    .line 693
    .line 694
    if-gez v3, :cond_29

    .line 695
    .line 696
    long-to-int v3, v1

    .line 697
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 698
    .line 699
    .line 700
    move-result-object v3

    .line 701
    move-object/from16 v13, v21

    .line 702
    .line 703
    invoke-virtual {v13, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 704
    .line 705
    .line 706
    move-result v3

    .line 707
    if-nez v3, :cond_28

    .line 708
    .line 709
    invoke-virtual {v11, v1, v2}, Lq0/a$b;->c(J)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 713
    .line 714
    .line 715
    move-result v1

    .line 716
    invoke-virtual {v0, v11, v1}, Lq0/a;->u(Lq0/a$b;I)V

    .line 717
    .line 718
    .line 719
    goto/16 :goto_e

    .line 720
    .line 721
    :cond_28
    if-eqz v7, :cond_20

    .line 722
    .line 723
    new-instance v3, Ljava/lang/StringBuilder;

    .line 724
    .line 725
    const-string v5, "Skip jump into the IFD since it has already been read: IfdType "

    .line 726
    .line 727
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    const-string v4, " (at "

    .line 734
    .line 735
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    const-string v1, ")"

    .line 742
    .line 743
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 744
    .line 745
    .line 746
    goto :goto_12

    .line 747
    :cond_29
    move-object/from16 v13, v21

    .line 748
    .line 749
    if-eqz v7, :cond_20

    .line 750
    .line 751
    new-instance v3, Ljava/lang/StringBuilder;

    .line 752
    .line 753
    const-string v4, "Skip jump into the IFD since its offset is invalid: "

    .line 754
    .line 755
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 759
    .line 760
    .line 761
    :goto_12
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v1

    .line 765
    invoke-static {v8, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 766
    .line 767
    .line 768
    goto/16 :goto_e

    .line 769
    .line 770
    :cond_2a
    move-object/from16 v13, v21

    .line 771
    .line 772
    move-wide/from16 v14, v22

    .line 773
    .line 774
    const/4 v10, 0x2

    .line 775
    long-to-int v1, v1

    .line 776
    new-array v1, v1, [B

    .line 777
    .line 778
    invoke-virtual {v11, v1}, Lq0/a$b;->readFully([B)V

    .line 779
    .line 780
    .line 781
    new-instance v2, Lq0/a$c;

    .line 782
    .line 783
    move/from16 v4, v26

    .line 784
    .line 785
    const/4 v10, 0x0

    .line 786
    invoke-direct {v2, v1, v5, v4, v10}, Lq0/a$c;-><init>([BIII)V

    .line 787
    .line 788
    .line 789
    aget-object v1, v28, p2

    .line 790
    .line 791
    iget-object v4, v3, Lq0/a$d;->b:Ljava/lang/String;

    .line 792
    .line 793
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    const-string v1, "DNGVersion"

    .line 797
    .line 798
    iget-object v3, v3, Lq0/a$d;->b:Ljava/lang/String;

    .line 799
    .line 800
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 801
    .line 802
    .line 803
    move-result v1

    .line 804
    if-eqz v1, :cond_2b

    .line 805
    .line 806
    const/4 v1, 0x3

    .line 807
    iput v1, v0, Lq0/a;->c:I

    .line 808
    .line 809
    :cond_2b
    const-string v1, "Make"

    .line 810
    .line 811
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    move-result v1

    .line 815
    if-nez v1, :cond_2c

    .line 816
    .line 817
    const-string v1, "Model"

    .line 818
    .line 819
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    move-result v1

    .line 823
    if-eqz v1, :cond_2d

    .line 824
    .line 825
    :cond_2c
    iget-object v1, v0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 826
    .line 827
    invoke-virtual {v2, v1}, Lq0/a$c;->g(Ljava/nio/ByteOrder;)Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    const-string v4, "PENTAX"

    .line 832
    .line 833
    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 834
    .line 835
    .line 836
    move-result v1

    .line 837
    if-nez v1, :cond_2e

    .line 838
    .line 839
    :cond_2d
    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 840
    .line 841
    .line 842
    move-result v1

    .line 843
    if-eqz v1, :cond_2f

    .line 844
    .line 845
    iget-object v1, v0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 846
    .line 847
    invoke-virtual {v2, v1}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    .line 848
    .line 849
    .line 850
    move-result v1

    .line 851
    const v2, 0xffff

    .line 852
    .line 853
    .line 854
    if-ne v1, v2, :cond_2f

    .line 855
    .line 856
    :cond_2e
    const/16 v1, 0x8

    .line 857
    .line 858
    iput v1, v0, Lq0/a;->c:I

    .line 859
    .line 860
    :cond_2f
    iget v1, v11, Lq0/a$b;->e:I

    .line 861
    .line 862
    int-to-long v1, v1

    .line 863
    cmp-long v1, v1, v14

    .line 864
    .line 865
    if-eqz v1, :cond_30

    .line 866
    .line 867
    :goto_13
    invoke-virtual {v11, v14, v15}, Lq0/a$b;->c(J)V

    .line 868
    .line 869
    .line 870
    :cond_30
    :goto_14
    add-int/lit8 v10, v20, 0x1

    .line 871
    .line 872
    int-to-short v10, v10

    .line 873
    move/from16 v2, p2

    .line 874
    .line 875
    move-object v1, v12

    .line 876
    move-object v4, v13

    .line 877
    move/from16 v3, v24

    .line 878
    .line 879
    const/4 v5, 0x2

    .line 880
    goto/16 :goto_0

    .line 881
    .line 882
    :cond_31
    move-object v12, v1

    .line 883
    move-object v13, v4

    .line 884
    move-object/from16 v28, v14

    .line 885
    .line 886
    iget v1, v11, Lq0/a$b;->e:I

    .line 887
    .line 888
    const/4 v2, 0x4

    .line 889
    add-int/2addr v1, v2

    .line 890
    if-gt v1, v6, :cond_36

    .line 891
    .line 892
    invoke-virtual/range {p1 .. p1}, Lq0/a$b;->readInt()I

    .line 893
    .line 894
    .line 895
    move-result v1

    .line 896
    if-eqz v7, :cond_32

    .line 897
    .line 898
    const/4 v2, 0x1

    .line 899
    new-array v2, v2, [Ljava/lang/Object;

    .line 900
    .line 901
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 902
    .line 903
    .line 904
    move-result-object v3

    .line 905
    const/4 v4, 0x0

    .line 906
    aput-object v3, v2, v4

    .line 907
    .line 908
    const-string v3, "nextIfdOffset: %d"

    .line 909
    .line 910
    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v2

    .line 914
    invoke-static {v8, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 915
    .line 916
    .line 917
    :cond_32
    int-to-long v2, v1

    .line 918
    const-wide/16 v4, 0x0

    .line 919
    .line 920
    cmp-long v4, v2, v4

    .line 921
    .line 922
    if-lez v4, :cond_35

    .line 923
    .line 924
    if-ge v1, v6, :cond_35

    .line 925
    .line 926
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 927
    .line 928
    .line 929
    move-result-object v4

    .line 930
    invoke-virtual {v13, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 931
    .line 932
    .line 933
    move-result v4

    .line 934
    if-nez v4, :cond_34

    .line 935
    .line 936
    invoke-virtual {v11, v2, v3}, Lq0/a$b;->c(J)V

    .line 937
    .line 938
    .line 939
    const/4 v1, 0x4

    .line 940
    aget-object v2, v28, v1

    .line 941
    .line 942
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 943
    .line 944
    .line 945
    move-result v2

    .line 946
    if-eqz v2, :cond_33

    .line 947
    .line 948
    :goto_15
    move v12, v1

    .line 949
    goto :goto_16

    .line 950
    :cond_33
    const/4 v1, 0x5

    .line 951
    aget-object v2, v28, v1

    .line 952
    .line 953
    invoke-virtual {v2}, Ljava/util/HashMap;->isEmpty()Z

    .line 954
    .line 955
    .line 956
    move-result v2

    .line 957
    if-eqz v2, :cond_36

    .line 958
    .line 959
    goto :goto_15

    .line 960
    :goto_16
    invoke-virtual {v0, v11, v12}, Lq0/a;->u(Lq0/a$b;I)V

    .line 961
    .line 962
    .line 963
    goto :goto_18

    .line 964
    :cond_34
    if-eqz v7, :cond_36

    .line 965
    .line 966
    new-instance v2, Ljava/lang/StringBuilder;

    .line 967
    .line 968
    const-string v3, "Stop reading file since re-reading an IFD may cause an infinite loop: "

    .line 969
    .line 970
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    goto :goto_17

    .line 974
    :cond_35
    if-eqz v7, :cond_36

    .line 975
    .line 976
    new-instance v2, Ljava/lang/StringBuilder;

    .line 977
    .line 978
    const-string v3, "Stop reading file since a wrong offset may cause an infinite loop: "

    .line 979
    .line 980
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 981
    .line 982
    .line 983
    :goto_17
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 984
    .line 985
    .line 986
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 987
    .line 988
    .line 989
    move-result-object v1

    .line 990
    invoke-static {v8, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 991
    .line 992
    .line 993
    :cond_36
    :goto_18
    return-void
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
.end method

.method public final v(Lq0/a$b;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lq0/a;->d:[Ljava/util/HashMap;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    aget-object v2, v2, v3

    .line 9
    .line 10
    const-string v3, "Compression"

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Lq0/a$c;

    .line 17
    .line 18
    if-eqz v3, :cond_f

    .line 19
    .line 20
    iget-object v4, v0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 21
    .line 22
    invoke-virtual {v3, v4}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x1

    .line 27
    const/4 v5, 0x6

    .line 28
    if-eq v3, v4, :cond_0

    .line 29
    .line 30
    if-eq v3, v5, :cond_f

    .line 31
    .line 32
    const/4 v6, 0x7

    .line 33
    if-eq v3, v6, :cond_0

    .line 34
    .line 35
    goto/16 :goto_7

    .line 36
    .line 37
    :cond_0
    const-string v3, "BitsPerSample"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lq0/a$c;

    .line 44
    .line 45
    const-string v6, "ExifInterface"

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    if-eqz v3, :cond_4

    .line 49
    .line 50
    iget-object v8, v0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 51
    .line 52
    invoke-virtual {v3, v8}, Lq0/a$c;->h(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, [I

    .line 57
    .line 58
    sget-object v8, Lq0/a;->n:[I

    .line 59
    .line 60
    invoke-static {v8, v3}, Ljava/util/Arrays;->equals([I[I)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-eqz v9, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    iget v9, v0, Lq0/a;->c:I

    .line 68
    .line 69
    const/4 v10, 0x3

    .line 70
    if-ne v9, v10, :cond_4

    .line 71
    .line 72
    const-string v9, "PhotometricInterpretation"

    .line 73
    .line 74
    invoke-virtual {v2, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    check-cast v9, Lq0/a$c;

    .line 79
    .line 80
    if-eqz v9, :cond_4

    .line 81
    .line 82
    iget-object v10, v0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 83
    .line 84
    invoke-virtual {v9, v10}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    if-ne v9, v4, :cond_2

    .line 89
    .line 90
    sget-object v10, Lq0/a;->o:[I

    .line 91
    .line 92
    invoke-static {v3, v10}, Ljava/util/Arrays;->equals([I[I)Z

    .line 93
    .line 94
    .line 95
    move-result v10

    .line 96
    if-nez v10, :cond_3

    .line 97
    .line 98
    :cond_2
    if-ne v9, v5, :cond_4

    .line 99
    .line 100
    invoke-static {v3, v8}, Ljava/util/Arrays;->equals([I[I)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    :cond_3
    :goto_0
    move v3, v4

    .line 107
    goto :goto_1

    .line 108
    :cond_4
    sget-boolean v3, Lq0/a;->m:Z

    .line 109
    .line 110
    if-eqz v3, :cond_5

    .line 111
    .line 112
    const-string v3, "Unsupported data type value"

    .line 113
    .line 114
    invoke-static {v6, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    :cond_5
    move v3, v7

    .line 118
    :goto_1
    if-eqz v3, :cond_10

    .line 119
    .line 120
    const-string v3, "StripOffsets"

    .line 121
    .line 122
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, Lq0/a$c;

    .line 127
    .line 128
    const-string v5, "StripByteCounts"

    .line 129
    .line 130
    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Lq0/a$c;

    .line 135
    .line 136
    if-eqz v3, :cond_10

    .line 137
    .line 138
    if-eqz v2, :cond_10

    .line 139
    .line 140
    iget-object v5, v0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 141
    .line 142
    invoke-virtual {v3, v5}, Lq0/a$c;->h(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-static {v3}, Lq0/a;->c(Ljava/io/Serializable;)[J

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    iget-object v5, v0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 151
    .line 152
    invoke-virtual {v2, v5}, Lq0/a$c;->h(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-static {v2}, Lq0/a;->c(Ljava/io/Serializable;)[J

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    if-eqz v3, :cond_e

    .line 161
    .line 162
    array-length v5, v3

    .line 163
    if-nez v5, :cond_6

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_6
    if-eqz v2, :cond_d

    .line 167
    .line 168
    array-length v5, v2

    .line 169
    if-nez v5, :cond_7

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_7
    array-length v5, v3

    .line 173
    array-length v8, v2

    .line 174
    if-eq v5, v8, :cond_8

    .line 175
    .line 176
    const-string v1, "stripOffsets and stripByteCounts should have same length."

    .line 177
    .line 178
    goto :goto_6

    .line 179
    :cond_8
    array-length v5, v2

    .line 180
    const-wide/16 v8, 0x0

    .line 181
    .line 182
    move v10, v7

    .line 183
    :goto_2
    if-ge v10, v5, :cond_9

    .line 184
    .line 185
    aget-wide v11, v2, v10

    .line 186
    .line 187
    add-long/2addr v8, v11

    .line 188
    add-int/lit8 v10, v10, 0x1

    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_9
    long-to-int v5, v8

    .line 192
    new-array v5, v5, [B

    .line 193
    .line 194
    iput-boolean v4, v0, Lq0/a;->g:Z

    .line 195
    .line 196
    move v8, v7

    .line 197
    move v9, v8

    .line 198
    move v10, v9

    .line 199
    :goto_3
    array-length v11, v3

    .line 200
    if-ge v8, v11, :cond_c

    .line 201
    .line 202
    aget-wide v11, v3, v8

    .line 203
    .line 204
    long-to-int v11, v11

    .line 205
    aget-wide v12, v2, v8

    .line 206
    .line 207
    long-to-int v12, v12

    .line 208
    array-length v13, v3

    .line 209
    sub-int/2addr v13, v4

    .line 210
    if-ge v8, v13, :cond_a

    .line 211
    .line 212
    add-int v13, v11, v12

    .line 213
    .line 214
    int-to-long v13, v13

    .line 215
    add-int/lit8 v15, v8, 0x1

    .line 216
    .line 217
    aget-wide v15, v3, v15

    .line 218
    .line 219
    cmp-long v13, v13, v15

    .line 220
    .line 221
    if-eqz v13, :cond_a

    .line 222
    .line 223
    iput-boolean v7, v0, Lq0/a;->g:Z

    .line 224
    .line 225
    :cond_a
    sub-int/2addr v11, v9

    .line 226
    if-gez v11, :cond_b

    .line 227
    .line 228
    const-string v13, "Invalid strip offset value"

    .line 229
    .line 230
    invoke-static {v6, v13}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 231
    .line 232
    .line 233
    :cond_b
    int-to-long v13, v11

    .line 234
    invoke-virtual {v1, v13, v14}, Lq0/a$b;->c(J)V

    .line 235
    .line 236
    .line 237
    add-int/2addr v9, v11

    .line 238
    new-array v11, v12, [B

    .line 239
    .line 240
    invoke-virtual {v1, v11}, Ljava/io/InputStream;->read([B)I

    .line 241
    .line 242
    .line 243
    add-int/2addr v9, v12

    .line 244
    invoke-static {v11, v7, v5, v10, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 245
    .line 246
    .line 247
    add-int/2addr v10, v12

    .line 248
    add-int/lit8 v8, v8, 0x1

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_c
    iget-boolean v1, v0, Lq0/a;->g:Z

    .line 252
    .line 253
    if-eqz v1, :cond_10

    .line 254
    .line 255
    aget-wide v1, v3, v7

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_d
    :goto_4
    const-string v1, "stripByteCounts should not be null or have zero length."

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_e
    :goto_5
    const-string v1, "stripOffsets should not be null or have zero length."

    .line 262
    .line 263
    :goto_6
    invoke-static {v6, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_f
    invoke-virtual {v0, v1, v2}, Lq0/a;->o(Lq0/a$b;Ljava/util/HashMap;)V

    .line 268
    .line 269
    .line 270
    :cond_10
    :goto_7
    return-void
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
.end method

.method public final w(II)V
    .locals 8

    iget-object v0, p0, Lq0/a;->d:[Ljava/util/HashMap;

    aget-object v1, v0, p1

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    const-string v2, "ExifInterface"

    sget-boolean v3, Lq0/a;->m:Z

    if-nez v1, :cond_6

    aget-object v1, v0, p2

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_4

    :cond_0
    aget-object v1, v0, p1

    const-string v4, "ImageLength"

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq0/a$c;

    aget-object v5, v0, p1

    const-string v6, "ImageWidth"

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq0/a$c;

    aget-object v7, v0, p2

    invoke-virtual {v7, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq0/a$c;

    aget-object v7, v0, p2

    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lq0/a$c;

    if-eqz v1, :cond_4

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v4, :cond_3

    if-nez v6, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    move-result v1

    iget-object v2, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    invoke-virtual {v5, v2}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    move-result v2

    iget-object v3, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    invoke-virtual {v4, v3}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    move-result v3

    iget-object v4, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    invoke-virtual {v6, v4}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    move-result v4

    if-ge v1, v3, :cond_5

    if-ge v2, v4, :cond_5

    aget-object v1, v0, p1

    aget-object v2, v0, p2

    aput-object v2, v0, p1

    aput-object v1, v0, p2

    goto :goto_3

    :cond_3
    :goto_0
    if-eqz v3, :cond_5

    const-string p1, "Second image does not contain valid size information"

    goto :goto_2

    :cond_4
    :goto_1
    if-eqz v3, :cond_5

    const-string p1, "First image does not contain valid size information"

    :goto_2
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    :goto_3
    return-void

    :cond_6
    :goto_4
    if-eqz v3, :cond_7

    const-string p1, "Cannot perform swap since only one image data exists"

    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    return-void
.end method

.method public final x(Lq0/a$b;I)V
    .locals 9

    .line 1
    iget-object v0, p0, Lq0/a;->d:[Ljava/util/HashMap;

    .line 2
    .line 3
    aget-object v1, v0, p2

    .line 4
    .line 5
    const-string v2, "DefaultCropSize"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Lq0/a$c;

    .line 12
    .line 13
    aget-object v2, v0, p2

    .line 14
    .line 15
    const-string v3, "SensorTopBorder"

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lq0/a$c;

    .line 22
    .line 23
    aget-object v3, v0, p2

    .line 24
    .line 25
    const-string v4, "SensorLeftBorder"

    .line 26
    .line 27
    invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Lq0/a$c;

    .line 32
    .line 33
    aget-object v4, v0, p2

    .line 34
    .line 35
    const-string v5, "SensorBottomBorder"

    .line 36
    .line 37
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lq0/a$c;

    .line 42
    .line 43
    aget-object v5, v0, p2

    .line 44
    .line 45
    const-string v6, "SensorRightBorder"

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    check-cast v5, Lq0/a$c;

    .line 52
    .line 53
    const-string v6, "ImageWidth"

    .line 54
    .line 55
    const-string v7, "ImageLength"

    .line 56
    .line 57
    if-eqz v1, :cond_5

    .line 58
    .line 59
    iget p1, v1, Lq0/a$c;->a:I

    .line 60
    .line 61
    const/4 v2, 0x5

    .line 62
    const/4 v3, 0x1

    .line 63
    const/4 v4, 0x0

    .line 64
    const/4 v5, 0x2

    .line 65
    const-string v8, "Invalid crop size values. cropSize="

    .line 66
    .line 67
    if-ne p1, v2, :cond_2

    .line 68
    .line 69
    iget-object p1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 70
    .line 71
    invoke-virtual {v1, p1}, Lq0/a$c;->h(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, [Lq0/a$e;

    .line 76
    .line 77
    if-eqz p1, :cond_1

    .line 78
    .line 79
    array-length v1, p1

    .line 80
    if-eq v1, v5, :cond_0

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_0
    aget-object v1, p1, v4

    .line 84
    .line 85
    iget-object v2, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 86
    .line 87
    invoke-static {v1, v2}, Lq0/a$c;->c(Lq0/a$e;Ljava/nio/ByteOrder;)Lq0/a$c;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    aget-object p1, p1, v3

    .line 92
    .line 93
    iget-object v2, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 94
    .line 95
    invoke-static {p1, v2}, Lq0/a$c;->c(Lq0/a$e;Ljava/nio/ByteOrder;)Lq0/a$c;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    goto :goto_1

    .line 100
    :cond_1
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {p2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    goto :goto_3

    .line 110
    :cond_2
    iget-object p1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 111
    .line 112
    invoke-virtual {v1, p1}, Lq0/a$c;->h(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, [I

    .line 117
    .line 118
    if-eqz p1, :cond_4

    .line 119
    .line 120
    array-length v1, p1

    .line 121
    if-eq v1, v5, :cond_3

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    aget v1, p1, v4

    .line 125
    .line 126
    iget-object v2, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 127
    .line 128
    invoke-static {v1, v2}, Lq0/a$c;->d(ILjava/nio/ByteOrder;)Lq0/a$c;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    aget p1, p1, v3

    .line 133
    .line 134
    iget-object v2, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 135
    .line 136
    invoke-static {p1, v2}, Lq0/a$c;->d(ILjava/nio/ByteOrder;)Lq0/a$c;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    :goto_1
    aget-object v2, v0, p2

    .line 141
    .line 142
    invoke-virtual {v2, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    aget-object p2, v0, p2

    .line 146
    .line 147
    invoke-virtual {p2, v7, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    goto/16 :goto_4

    .line 151
    .line 152
    :cond_4
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {p2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    :goto_3
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    const-string p2, "ExifInterface"

    .line 169
    .line 170
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_5
    if-eqz v2, :cond_6

    .line 175
    .line 176
    if-eqz v3, :cond_6

    .line 177
    .line 178
    if-eqz v4, :cond_6

    .line 179
    .line 180
    if-eqz v5, :cond_6

    .line 181
    .line 182
    iget-object p1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 183
    .line 184
    invoke-virtual {v2, p1}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    iget-object v1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 189
    .line 190
    invoke-virtual {v4, v1}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    iget-object v2, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 195
    .line 196
    invoke-virtual {v5, v2}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    iget-object v4, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 201
    .line 202
    invoke-virtual {v3, v4}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-le v1, p1, :cond_8

    .line 207
    .line 208
    if-le v2, v3, :cond_8

    .line 209
    .line 210
    sub-int/2addr v1, p1

    .line 211
    sub-int/2addr v2, v3

    .line 212
    iget-object p1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 213
    .line 214
    invoke-static {v1, p1}, Lq0/a$c;->d(ILjava/nio/ByteOrder;)Lq0/a$c;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    iget-object v1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 219
    .line 220
    invoke-static {v2, v1}, Lq0/a$c;->d(ILjava/nio/ByteOrder;)Lq0/a$c;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    aget-object v2, v0, p2

    .line 225
    .line 226
    invoke-virtual {v2, v7, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    aget-object p1, v0, p2

    .line 230
    .line 231
    invoke-virtual {p1, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_6
    aget-object v1, v0, p2

    .line 236
    .line 237
    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    check-cast v1, Lq0/a$c;

    .line 242
    .line 243
    aget-object v2, v0, p2

    .line 244
    .line 245
    invoke-virtual {v2, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    check-cast v2, Lq0/a$c;

    .line 250
    .line 251
    if-eqz v1, :cond_7

    .line 252
    .line 253
    if-nez v2, :cond_8

    .line 254
    .line 255
    :cond_7
    aget-object v0, v0, p2

    .line 256
    .line 257
    const-string v1, "JPEGInterchangeFormat"

    .line 258
    .line 259
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, Lq0/a$c;

    .line 264
    .line 265
    if-eqz v0, :cond_8

    .line 266
    .line 267
    iget-object v1, p0, Lq0/a;->f:Ljava/nio/ByteOrder;

    .line 268
    .line 269
    invoke-virtual {v0, v1}, Lq0/a$c;->f(Ljava/nio/ByteOrder;)I

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    invoke-virtual {p0, p1, v0, p2}, Lq0/a;->g(Lq0/a$b;II)V

    .line 274
    .line 275
    .line 276
    :cond_8
    :goto_4
    return-void
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method

.method public final y()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x5

    invoke-virtual {p0, v0, v1}, Lq0/a;->w(II)V

    const/4 v2, 0x4

    invoke-virtual {p0, v0, v2}, Lq0/a;->w(II)V

    invoke-virtual {p0, v1, v2}, Lq0/a;->w(II)V

    iget-object v3, p0, Lq0/a;->d:[Ljava/util/HashMap;

    const/4 v4, 0x1

    aget-object v5, v3, v4

    const-string v6, "PixelXDimension"

    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq0/a$c;

    aget-object v4, v3, v4

    const-string v6, "PixelYDimension"

    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq0/a$c;

    if-eqz v5, :cond_0

    if-eqz v4, :cond_0

    aget-object v6, v3, v0

    const-string v7, "ImageWidth"

    invoke-virtual {v6, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v0, v3, v0

    const-string v5, "ImageLength"

    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    aget-object v0, v3, v2

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    aget-object v0, v3, v1

    invoke-virtual {p0, v0}, Lq0/a;->p(Ljava/util/HashMap;)Z

    move-result v0

    if-eqz v0, :cond_1

    aget-object v0, v3, v1

    aput-object v0, v3, v2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    aput-object v0, v3, v1

    :cond_1
    aget-object v0, v3, v2

    invoke-virtual {p0, v0}, Lq0/a;->p(Ljava/util/HashMap;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "ExifInterface"

    const-string v1, "No image meets the size requirements of a thumbnail image."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method
