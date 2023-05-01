.class public final Ly/e$a;
.super Lc0/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final f:Lx/f$e;


# direct methods
.method public constructor <init>(Lx/f$e;)V
    .locals 0

    invoke-direct {p0}, Lc0/n;-><init>()V

    iput-object p1, p0, Ly/e$a;->f:Lx/f$e;

    return-void
.end method
