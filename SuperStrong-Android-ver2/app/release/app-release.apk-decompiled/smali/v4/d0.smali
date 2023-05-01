.class public abstract Lv4/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/d0$a;
    }
.end annotation


# instance fields
.field public b:Lv4/d0$a;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract c()J
.end method

.method public close()V
    .locals 1

    invoke-virtual {p0}, Lv4/d0;->h()Lf5/g;

    move-result-object v0

    invoke-static {v0}, Lw4/e;->b(Ljava/io/Closeable;)V

    return-void
.end method

.method public abstract f()Lv4/s;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract h()Lf5/g;
.end method
