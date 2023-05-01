.class public final Lv4/z;
.super Lv4/a0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lv4/s;

.field public final synthetic b:I

.field public final synthetic c:[B

.field public final synthetic d:I


# direct methods
.method public constructor <init>(I[B)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lv4/z;->a:Lv4/s;

    iput p1, p0, Lv4/z;->b:I

    iput-object p2, p0, Lv4/z;->c:[B

    const/4 p1, 0x0

    iput p1, p0, Lv4/z;->d:I

    invoke-direct {p0}, Lv4/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget v0, p0, Lv4/z;->b:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final b()Lv4/s;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lv4/z;->a:Lv4/s;

    return-object v0
.end method

.method public final c(Lf5/f;)V
    .locals 3

    iget v0, p0, Lv4/z;->b:I

    iget-object v1, p0, Lv4/z;->c:[B

    iget v2, p0, Lv4/z;->d:I

    invoke-interface {p1, v1, v2, v0}, Lf5/f;->write([BII)Lf5/f;

    return-void
.end method
