.class public final synthetic Lx/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lx/f$e;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lx/f$e;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx/h;->b:Lx/f$e;

    iput p2, p0, Lx/h;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lx/h;->b:Lx/f$e;

    iget v1, p0, Lx/h;->c:I

    invoke-virtual {v0, v1}, Lx/f$e;->c(I)V

    return-void
.end method
