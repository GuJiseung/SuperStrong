.class public abstract Ls0/c;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final b:Landroidx/fragment/app/o;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/o;Ljava/lang/String;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Ll4/f;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Ls0/c;->b:Landroidx/fragment/app/o;

    return-void
.end method
