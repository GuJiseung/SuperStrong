.class public final synthetic Lx/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lx/f$e;

.field public final synthetic c:Landroid/graphics/Typeface;


# direct methods
.method public synthetic constructor <init>(Lx/f$e;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx/g;->b:Lx/f$e;

    iput-object p2, p0, Lx/g;->c:Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lx/g;->b:Lx/f$e;

    iget-object v1, p0, Lx/g;->c:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lx/f$e;->d(Landroid/graphics/Typeface;)V

    return-void
.end method
