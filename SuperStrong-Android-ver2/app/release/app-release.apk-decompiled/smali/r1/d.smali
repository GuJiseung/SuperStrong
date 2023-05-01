.class public final Lr1/d;
.super Lq1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lq1/b<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Ll1/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lq1/b;-><init>()V

    new-instance v0, Ll1/e;

    invoke-direct {v0}, Ll1/e;-><init>()V

    iput-object v0, p0, Lr1/d;->b:Ll1/e;

    return-void
.end method
