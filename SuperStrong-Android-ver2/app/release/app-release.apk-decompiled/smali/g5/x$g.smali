.class public final Lg5/x$g;
.super Lg5/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lg5/x<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/reflect/Method;

.field public final b:I

.field public final c:Lv4/p;

.field public final d:Lg5/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg5/f<",
            "TT;",
            "Lv4/a0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;ILv4/p;Lg5/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "I",
            "Lv4/p;",
            "Lg5/f<",
            "TT;",
            "Lv4/a0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lg5/x;-><init>()V

    iput-object p1, p0, Lg5/x$g;->a:Ljava/lang/reflect/Method;

    iput p2, p0, Lg5/x$g;->b:I

    iput-object p3, p0, Lg5/x$g;->c:Lv4/p;

    iput-object p4, p0, Lg5/x$g;->d:Lg5/f;

    return-void
.end method


# virtual methods
.method public final a(Lg5/z;Ljava/lang/Object;)V
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/z;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lg5/x$g;->d:Lg5/f;

    invoke-interface {v0, p2}, Lg5/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv4/a0;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p2, p0, Lg5/x$g;->c:Lv4/p;

    invoke-virtual {p1, p2, v0}, Lg5/z;->c(Lv4/p;Lv4/a0;)V

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to convert "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " to RequestBody"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    iget-object p1, p0, Lg5/x$g;->a:Ljava/lang/reflect/Method;

    iget v1, p0, Lg5/x$g;->b:I

    invoke-static {p1, v1, p2, v0}, Lg5/h0;->j(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1
.end method
