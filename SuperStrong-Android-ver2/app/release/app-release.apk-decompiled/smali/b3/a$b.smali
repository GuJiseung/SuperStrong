.class public final Lb3/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb3/a;->onSizeChanged(IIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lb3/a;


# direct methods
.method public constructor <init>(Lb3/a;I)V
    .locals 0

    iput-object p1, p0, Lb3/a$b;->c:Lb3/a;

    iput p2, p0, Lb3/a$b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb3/a$b;->c:Lb3/a;

    iget v1, p0, Lb3/a$b;->b:I

    invoke-virtual {v0, v1}, Lb3/a;->g(I)V

    return-void
.end method
