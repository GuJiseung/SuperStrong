.class public final Lj1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj1/b;

.field public final b:Ll1/b;

.field public final c:Landroid/content/ContentResolver;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, La1/f0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La1/f0;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Lj1/b;Ll1/b;Landroid/content/ContentResolver;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lj1/c;->a:Lj1/b;

    iput-object p3, p0, Lj1/c;->b:Ll1/b;

    iput-object p4, p0, Lj1/c;->c:Landroid/content/ContentResolver;

    iput-object p1, p0, Lj1/c;->d:Ljava/util/List;

    return-void
.end method
