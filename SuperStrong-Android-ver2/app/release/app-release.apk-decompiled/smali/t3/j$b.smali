.class public abstract Lt3/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/j$b;->a:Ljava/lang/String;

    iput-boolean p2, p0, Lt3/j$b;->b:Z

    iput-boolean p3, p0, Lt3/j$b;->c:Z

    return-void
.end method


# virtual methods
.method public abstract a(Lx3/a;Ljava/lang/Object;)V
.end method

.method public abstract b(Lx3/c;Ljava/lang/Object;)V
.end method

.method public abstract c(Ljava/lang/Object;)Z
.end method
