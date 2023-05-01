.class public final Lg5/t$c;
.super Lv4/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final c:Lv4/s;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final d:J


# direct methods
.method public constructor <init>(Lv4/s;J)V
    .locals 0
    .param p1    # Lv4/s;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Lv4/d0;-><init>()V

    iput-object p1, p0, Lg5/t$c;->c:Lv4/s;

    iput-wide p2, p0, Lg5/t$c;->d:J

    return-void
.end method


# virtual methods
.method public final c()J
    .locals 2

    iget-wide v0, p0, Lg5/t$c;->d:J

    return-wide v0
.end method

.method public final f()Lv4/s;
    .locals 1

    iget-object v0, p0, Lg5/t$c;->c:Lv4/s;

    return-object v0
.end method

.method public final h()Lf5/g;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot read raw response body of a converted body."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
