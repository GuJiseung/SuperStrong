.class public final Ly4/i$a;
.super Lf5/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic k:Ly4/i;


# direct methods
.method public constructor <init>(Ly4/i;)V
    .locals 0

    iput-object p1, p0, Ly4/i$a;->k:Ly4/i;

    invoke-direct {p0}, Lf5/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final n()V
    .locals 1

    iget-object v0, p0, Ly4/i$a;->k:Ly4/i;

    invoke-virtual {v0}, Ly4/i;->a()V

    return-void
.end method
